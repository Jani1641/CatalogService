package com.EcommWeb.CatalogService.exceptionHandler;

import com.EcommWeb.CatalogService.exceptionResponses.ExceptionResponse;
import com.EcommWeb.CatalogService.exceptions.AlreadyDeletedException;
import com.EcommWeb.CatalogService.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
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
