package courswork.two.questions.services;

import courswork.two.questions.model.Question;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;
    private final List<Question> list;
    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
        this.list = new ArrayList<>();
    }
    @Override
    public List<Question> getQuestions(int amount) {
        for(int i = 0; i<=amount;i++) {
            Question q = questionService.getRandomQuestion(amount);
            if (!checkQuestions(q))
                list.add(q);
        }
        return list;
    }
    public boolean checkQuestions(Question q){
        return list.contains(q);
    }
}
