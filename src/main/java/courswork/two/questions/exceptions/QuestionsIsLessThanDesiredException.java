package courswork.two.questions.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionsIsLessThanDesiredException extends RuntimeException{
    public QuestionsIsLessThanDesiredException(String message) {
        super(message);
    }

    public QuestionsIsLessThanDesiredException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionsIsLessThanDesiredException(Throwable cause) {
        super(cause);
    }

    public QuestionsIsLessThanDesiredException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
