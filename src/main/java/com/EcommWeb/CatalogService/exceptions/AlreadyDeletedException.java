package com.EcommWeb.CatalogService.exceptions;

public class AlreadyDeletedException extends RuntimeException{
    public AlreadyDeletedException(){
        super();
    }
    public AlreadyDeletedException(String message){
        super(message);
    }

}
