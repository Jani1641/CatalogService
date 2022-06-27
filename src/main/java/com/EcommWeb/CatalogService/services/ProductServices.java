package com.EcommWeb.CatalogService.services;

import com.EcommWeb.CatalogService.entities.Product;
import com.EcommWeb.CatalogService.exceptions.ResourceNotFoundException;
import com.EcommWeb.CatalogService.models.PdpResponse;
import com.EcommWeb.CatalogService.models.PlpResponse;
import com.EcommWeb.CatalogService.repositories.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class ProductServices {

    @Autowired
    private ProductRepository productRepository;

    public List<PlpResponse> plpService(){
        log.info("Started plpService function from ProductServices");
        PlpConverter converter = new PlpConverter();
        List<PlpResponse> val = productRepository.findAll().stream()
                .map(product ->{ return converter.convertProductToPlp(product);})
                .collect(Collectors.toList());
        log.info("End of plpService function from ProductServices");
        return val;
    }

    public Product findProductById (Integer product_id){
        log.info("Started findProductById function from ProductServices");
        Product product = productRepository.findById(product_id).orElseThrow(() ->
                new ResourceNotFoundException("id " + Integer.toString(product_id) + " is not found")
        );
        log.info("End of findProductById function from ProductServices");
        return product;
    }
    public PdpResponse pdpService(Integer product_id){
        log.info("Started pdpService function in ProductServices");
        PdpConverter converter = new PdpConverter();
        PdpResponse pdpResponse = converter.convertProductToPdp(findProductById(product_id));
        log.info("End of pdpService function in ProductServices");
        return pdpResponse;
    }

    public void addProductService(Product product){
        log.info("Started addProductService function in ProductServices");
        productRepository.save(product);
        log.info("End of addProductService function in ProductServices");
    }


    public void deleteProductService(Integer product_id){
        log.info("Started deleteProductService function from ProductServices");
        productRepository.deleteById(product_id);
        log.info("End of deleteProductService function from ProductServices");
    }
}
