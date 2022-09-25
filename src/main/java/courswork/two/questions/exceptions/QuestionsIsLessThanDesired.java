package courswork.two.questions.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionsIsLessThanDesired extends RuntimeException{
    public QuestionsIsLessThanDesired(String message) {
        super(message);
    }

    public QuestionsIsLessThanDesired(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionsIsLessThanDesired(Throwable cause) {
        super(cause);
    }

    public QuestionsIsLessThanDesired(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
