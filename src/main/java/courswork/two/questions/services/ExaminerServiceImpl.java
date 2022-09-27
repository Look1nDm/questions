package courswork.two.questions.services;

import courswork.two.questions.model.Question;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;
    private final Set<Question> set = new HashSet<>();

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Set<Question> getQuestions(int amount) {
        for (int i = 0; i <= amount; i++) {
            Question q = questionService.getRandomQuestion(amount);
                set.add(q);
        }
        return set;
    }
}
