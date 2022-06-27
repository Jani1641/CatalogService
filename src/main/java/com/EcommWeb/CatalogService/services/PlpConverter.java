package com.EcommWeb.CatalogService.services;

import com.EcommWeb.CatalogService.entities.Product;
import com.EcommWeb.CatalogService.models.PlpResponse;

public class PlpConverter {
    public PlpResponse convertProductToPlp(Product product){
        PlpResponse response = new PlpResponse.PlpResponseBuilder()
                .title(product.getTitle())
                .price(product.getPrice())
                .build();
        return  response;
    }
}
