package com.EcommWeb.CatalogService.models;

import com.EcommWeb.CatalogService.entities.Product;
import com.EcommWeb.CatalogService.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PlpResponse {
    private String title;
    private float price;


    private PlpResponse(PlpResponseBuilder plpresponseBuilder) {
        this.title = plpresponseBuilder.title;
        this.price = plpresponseBuilder.price;
    }

    public static class PlpResponseBuilder {
        private String title;
        private float price;
        public  PlpResponseBuilder title(String title){
            this.title = title;
            return this;
        }

        public PlpResponseBuilder price(float price){
            this.price = price;
            return this;
        }

        public PlpResponse build(){
            return new PlpResponse(this);
        }
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public static PlpResponse convertPlp(Product product){
        PlpResponse response =  new PlpResponseBuilder()
                .title(product.getTitle())
                .price(product.getPrice())
                .build();
        return  response;
    }
}
