package com.EcommWeb.CatalogService.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    private String message;

    public ResourceNotFoundException(String msg) {
        super(msg);
        this.message=msg;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
