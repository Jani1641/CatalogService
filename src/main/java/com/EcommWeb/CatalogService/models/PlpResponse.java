package com.EcommWeb.CatalogService.models;

public class PlpResponse  {

    private Integer id;
    private String title;
    private float price;
    private String imageUrl;
    private String category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    private PlpResponse(PlpResponseBuilder plpresponseBuilder) {
        this.id = plpresponseBuilder.id;
        this.title = plpresponseBuilder.title;
        this.price = plpresponseBuilder.price;
        this.imageUrl = plpresponseBuilder.imageUrl;
        this.category = plpresponseBuilder.category;
    }
    public static class PlpResponseBuilder {
        private String title;
        private float price;
        private String imageUrl;
        private  Integer id;
        private String category;
        public  PlpResponseBuilder title(String title){
            this.title = title;
            return this;
        }
        public PlpResponseBuilder imageUrl(String imageUrl){
            this.imageUrl=imageUrl;
            return this;
        }
        public PlpResponseBuilder price(float price){
            this.price = price;
            return this;
        }

        public PlpResponseBuilder category (String category){
            this.category = category;
            return  this;
        }

        public  PlpResponseBuilder id (Integer id){
            this.id = id;
            return  this;
        }
        public PlpResponse build(){
            return new PlpResponse(this);
        }
    }
}
