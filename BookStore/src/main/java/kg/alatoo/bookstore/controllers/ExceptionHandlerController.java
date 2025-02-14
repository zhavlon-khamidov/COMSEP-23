package kg.alatoo.bookstore.controllers;

import kg.alatoo.bookstore.exceptions.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@Slf4j
public class ExceptionHandlerController {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, Object> handleNotFoundException(NotFoundException ex) {
        log.debug("Handling NotFoundException");
        HashMap<String, Object> responseBody = new HashMap<>();
        responseBody.put("timestamp", System.currentTimeMillis());
        responseBody.put("message", ex.getMessage());
        responseBody.put("status", HttpStatus.NOT_FOUND);
        return responseBody;
    }


}
