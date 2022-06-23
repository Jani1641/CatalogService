package com.EcommWeb.CatalogService.models;

import com.EcommWeb.CatalogService.entities.Product;

import java.util.Optional;

public class PdpResponse {
    private String title;

    private String description;
    private float price;


    private PdpResponse(PdpResponseBuilder pdpresponseBuilder) {
        this.title = pdpresponseBuilder.title;
        this.price = pdpresponseBuilder.price;
        this.description=pdpresponseBuilder.description;
    }

    public static class PdpResponseBuilder {

        private String title;
        private String description;
        private float price;
        public PdpResponseBuilder title(String title){
            this.title = title;
            return this;
        }
        public PdpResponseBuilder price(float price){
            this.price = price;
            return this;
        }
        public PdpResponseBuilder description(String description){
            this.description = description;
            return this;
        }
        public PdpResponse build(){
            return new PdpResponse(this);
        }
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public static PdpResponse convertPdp (Optional<Product> pro){
        if(!pro.isPresent()) throw new RuntimeException("id not present");
        Product product = pro.get();
        PdpResponse convert = new PdpResponseBuilder()
                .title(product.getTitle())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
        return convert;
    }
}