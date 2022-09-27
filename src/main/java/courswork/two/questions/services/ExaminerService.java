package courswork.two.questions.services;

import courswork.two.questions.model.Question;

import java.util.Set;

public interface ExaminerService {
    Set<Question> getQuestions(int amount);
}
