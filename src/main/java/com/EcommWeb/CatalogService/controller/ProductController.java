package com.EcommWeb.CatalogService.controller;

import com.EcommWeb.CatalogService.entities.Product;
import com.EcommWeb.CatalogService.models.PdpResponse;
import com.EcommWeb.CatalogService.models.PlpResponse;
import com.EcommWeb.CatalogService.repositories.ProductRepository;
import com.EcommWeb.CatalogService.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductServices productServices;

    @GetMapping("/list")
    public ResponseEntity<List<PlpResponse>> retreiveProducts(){
        List<PlpResponse> val = productServices.plpService();
        return  ResponseEntity.ok().body(val);
    }

    @GetMapping("/list/{product_id}")
    public ResponseEntity<PdpResponse> retrieveProduct (@PathVariable Integer product_id){
        PdpResponse val = productServices.pdpService(product_id);
        return ResponseEntity.ok().body(val);
    }

    @PostMapping("/list")
    public ResponseEntity<Object> addList(@RequestBody Product product){
        productServices.addProductService(product);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/list/{product_id}")
    public void deleteProduct(@PathVariable int product_id){
        productServices.deleteProductService(product_id);
    }

}
