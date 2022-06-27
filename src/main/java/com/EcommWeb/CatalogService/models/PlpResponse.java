package com.EcommWeb.CatalogService.models;

public class PlpResponse  {
    private String title;
    private float price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

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
}
