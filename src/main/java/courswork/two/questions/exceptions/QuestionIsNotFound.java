package courswork.two.questions.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionIsNotFound extends RuntimeException{
    public QuestionIsNotFound() {
    }

    public QuestionIsNotFound(String message) {
        super(message);
    }

    public QuestionIsNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionIsNotFound(Throwable cause) {
        super(cause);
    }

    public QuestionIsNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
