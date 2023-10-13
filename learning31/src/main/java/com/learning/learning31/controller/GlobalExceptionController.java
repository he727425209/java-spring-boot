package com.learning.learning31.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@ControllerAdvice
public class GlobalExceptionController {
    @ExceptionHandler({NullPointerException.class,
    ArrayIndexOutOfBoundsException.class,
    RuntimeException.class})
    public ModelAndView exceptionHandler(Exception exception) {
        ModelAndView error = new ModelAndView();
        error.setViewName("error");
        error.addObject("errormsg", exception.getMessage());
        return error;
    }

}
