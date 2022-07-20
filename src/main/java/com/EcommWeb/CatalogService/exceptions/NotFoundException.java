package com.EcommWeb.CatalogService.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException{
    private String message;

    public NotFoundException(String msg) {
        super(msg);
        this.message=msg;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
