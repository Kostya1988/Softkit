package Test.Softkit.Exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class InfoException extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value
            = {InfoNotFoundException.class})
    protected ResponseEntity<Object> handleConflict(
            RuntimeException ex) {
        logger.info("Start thinking", ex);
        return new ResponseEntity<>(ex.getMessage(), new HttpHeaders(),
                HttpStatus.NOT_FOUND);
    }
}


