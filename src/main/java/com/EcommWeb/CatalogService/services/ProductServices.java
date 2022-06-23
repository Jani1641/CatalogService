package com.EcommWeb.CatalogService.services;

import com.EcommWeb.CatalogService.entities.Product;
import com.EcommWeb.CatalogService.models.PdpResponse;
import com.EcommWeb.CatalogService.models.PlpResponse;
import com.EcommWeb.CatalogService.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository productRepository;

    public List<PlpResponse> plpService(){
        List<PlpResponse> val = productRepository.findAll().stream()
                .map(PlpResponse::convertPlp)
                .collect(Collectors.toList());
        return val;
    }

    public PdpResponse pdpService(Integer product_id){
        return PdpResponse.convertPdp(productRepository.findById(product_id));
    }

    public void addProductService(Product product){
        productRepository.save(product);
    }

    public void deleteProductService(Integer product_id){
        productRepository.deleteById(product_id);
    }
}
