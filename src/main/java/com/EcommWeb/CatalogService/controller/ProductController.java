package com.EcommWeb.CatalogService.controller;

import com.EcommWeb.CatalogService.entities.Product;
import com.EcommWeb.CatalogService.models.PdpResponse;
import com.EcommWeb.CatalogService.models.PlpResponse;
import com.EcommWeb.CatalogService.services.ProductServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin("*")
@Slf4j
@RestController
public class ProductController {

    @Autowired
    private ProductServices productServices;

    @GetMapping("/list")
    public ResponseEntity<List<PlpResponse>> retrieveProducts(){
        log.info("Started retrieveProducts function from Controller");
        List<PlpResponse> val = productServices.plpService();
        log.info("End of retrieveProducts function from Controller");
        return  new ResponseEntity<>(val,HttpStatus.OK);
    }

    @GetMapping("/list/{product_id}")
    public ResponseEntity<PdpResponse> retrieveProduct (@PathVariable Integer product_id){
        log.info("Started retrieveProduct function from Controller");
        PdpResponse val = productServices.pdpService(product_id);
        log.info("End of retrieveProduct function from Controller");
        return ResponseEntity.ok().body(val);
    }

    @PostMapping("/list")
    public ResponseEntity<Object> addList(@RequestBody Product product){
        log.info("Started addList function from Controller");
        productServices.addProductService(product);
        log.info("End of addList function from Controller");
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/list/{product_id}")
    public void deleteProduct(@PathVariable int product_id){
        log.info("Started deleteProduct function from controller");
        productServices.deleteProductService(product_id);
        log.info("End of deleteProduct function from controller");
    }

}
