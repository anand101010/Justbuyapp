package com.bezkoder.spring.datajpa.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {NotFoundException.class})
      public ResponseEntity<Object>exceptionalHandler(NotFoundException notFoundException){
          GlobalException globalException=new GlobalException(notFoundException.getMessage(),notFoundException.getCause(), HttpStatus.NOT_FOUND);

          return new ResponseEntity<>(globalException,HttpStatus.NOT_FOUND);
      }

}
