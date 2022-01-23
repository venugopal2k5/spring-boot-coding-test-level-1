package com.codejam.demo.exception;

import java.util.Locale;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(CompanyGlobalException.class)
    protected ResponseEntity handleGlobalException(CompanyGlobalException companyGlobalException, Locale locale) {
        return ResponseEntity
                .badRequest()
                .body( companyGlobalException.getCode() + companyGlobalException.getMessage());
               
    }

    @ExceptionHandler({Exception.class})
    protected ResponseEntity handleException(Exception e, Locale locale) {
        return ResponseEntity
                .badRequest()
                .body("Exception occur inside API " + e);
    }

}
