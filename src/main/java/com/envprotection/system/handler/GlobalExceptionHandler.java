package com.envprotection.system.handler;

import com.envprotection.system.util.Response;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    private Response exceptionHandler(HttpServletRequest req, Exception e){
        return new Response().failure(e.getMessage());
    }
}
