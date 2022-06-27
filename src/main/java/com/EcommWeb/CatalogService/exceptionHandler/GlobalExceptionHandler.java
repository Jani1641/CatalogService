package com.EcommWeb.CatalogService.exceptionHandler;

import com.EcommWeb.CatalogService.exceptionResponses.ExceptionResponse;
import com.EcommWeb.CatalogService.exceptions.AlreadyDeletedException;
import com.EcommWeb.CatalogService.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handle (Exception ex){
        HttpStatus status = HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(new ExceptionResponse(status, ex.getMessage()),status);
    }

    @ExceptionHandler(AlreadyDeletedException.class)
    public ResponseEntity<ExceptionResponse> handleItemAlreadyException (Exception ex){
        HttpStatus status = HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(new ExceptionResponse(status, ex.getMessage()),status);
    }

}
