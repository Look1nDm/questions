package courswork.two.questions.services;

import courswork.two.questions.model.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public interface QuestionService {
    Question add(String question,String answer);
    Question remove (String question, String answer);
    Collection<Question> getAll();
    Question getRandomQuestion(int amount);
}
