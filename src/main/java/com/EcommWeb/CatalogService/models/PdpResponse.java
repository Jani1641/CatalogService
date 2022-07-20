package com.EcommWeb.CatalogService.models;


public class PdpResponse  {
    private String title;
    private String description;
    private float price;
    private String imageUrl;

    private  String category;


    private PdpResponse(PdpResponseBuilder pdpresponseBuilder) {
        this.title = pdpresponseBuilder.title;
        this.price = pdpresponseBuilder.price;
        this.description=pdpresponseBuilder.description;
        this.imageUrl = pdpresponseBuilder.imageUrl;
        this.category = pdpresponseBuilder.category;
    }

    public static class PdpResponseBuilder {

        private String title;
        private String description;
        private float price;
        private String imageUrl;
        private String category;
        public PdpResponseBuilder title(String title){
            this.title = title;
            return this;
        }
        public PdpResponseBuilder price(float price){
            this.price = price;
            return this;
        }public PdpResponseBuilder description(String description){
            this.description = description;
            return this;
        }
        public PdpResponseBuilder imageUrl(String imageUrl){
            this.imageUrl = imageUrl;
            return this;
        }

        public PdpResponseBuilder category(String category){
            this.category = category;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public float getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}
