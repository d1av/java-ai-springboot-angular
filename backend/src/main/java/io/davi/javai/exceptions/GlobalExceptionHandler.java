package io.davi.javai.exceptions;

import io.davi.javai.dto.ErrorDetails;
import io.davi.javai.services.GeneratorService;
import io.davi.javai.services.LoggingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    private LoggingService loggingService;

    public GlobalExceptionHandler(LoggingService loggingService) {
        this.loggingService = loggingService;
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ErrorDetails> handleNullPointerException(NullPointerException exception,
                                                                   WebRequest webRequest) {
        ErrorDetails errorDetails = new ErrorDetails(new Date(), exception.getMessage(),
                webRequest.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(HttpRequestError.class)
    public ResponseEntity<ErrorDetails> handleNullPointerException(HttpRequestError exception,
                                                                   WebRequest webRequest) {
        ErrorDetails errorDetails = new ErrorDetails(new Date(), exception.getMessage(),
                webRequest.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(HttpClientErrorException.class)
    public RedirectView handleHttpError(HttpClientErrorException exception,
                                        WebRequest webRequest) {
        // save error database and redirect to get new endpoint
        ErrorDetails errorDetails = new ErrorDetails(new Date(), exception.getMessage(),
                webRequest.getDescription(false));
        loggingService.saveErrorToDatabase("HttpClientErrorException", exception.getMessage());
        return new RedirectView("/api/v1");
    }
}
