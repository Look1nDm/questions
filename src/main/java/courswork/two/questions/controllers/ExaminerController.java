package courswork.two.questions.controllers;

import courswork.two.questions.model.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import courswork.two.questions.services.ExaminerService;

import java.util.List;

@RestController

public class ExaminerController {
    private final ExaminerService examinerService;


    public ExaminerController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping(path = "/get")
    public List<Question> listQuestions (int amount){
        return examinerService.getQuestions(amount);
    }
}
