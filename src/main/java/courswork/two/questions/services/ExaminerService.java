package courswork.two.questions.services;

import courswork.two.questions.model.Question;

import java.util.List;

public interface ExaminerService {
    List<Question> getQuestions(int amount);
}
