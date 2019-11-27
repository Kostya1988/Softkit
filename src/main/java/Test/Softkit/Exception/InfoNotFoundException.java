package Test.Softkit.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class InfoNotFoundException extends RuntimeException {
    public InfoNotFoundException() {
        super();
    }

    public InfoNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public InfoNotFoundException(String message) {
        super(message);
    }

    public InfoNotFoundException(Throwable cause) {
        super(cause);
    }
}