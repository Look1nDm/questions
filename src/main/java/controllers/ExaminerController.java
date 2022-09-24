package controllers;

import model.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import services.ExaminerService;

import java.util.List;

@RestController

public class ExaminerController {
    private final ExaminerService examinerService;


    public ExaminerController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping(path = "/")
    public List<Question> listQuestions (int amount){
        return examinerService.getQuestions(amount);
    }
}
