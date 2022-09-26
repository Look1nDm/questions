package courswork.two.questions.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionIsNotFoundException extends RuntimeException{
    public QuestionIsNotFoundException() {
    }

    public QuestionIsNotFoundException(String message) {
        super(message);
    }

    public QuestionIsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionIsNotFoundException(Throwable cause) {
        super(cause);
    }

    public QuestionIsNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
