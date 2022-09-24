package controllers;

import model.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import services.QuestionService;

import java.util.Collection;


@RestController
@RequestMapping(path = "/exam")
public class JavaQuestionController {
    private final QuestionService questionService;

    public JavaQuestionController(QuestionService service) {
        this.questionService = service;
    }

    @GetMapping(path = "/java")
    public Collection<Question> printAll() {
        return questionService.getAll();
    }

    @GetMapping(path = "/java/add")
    public Question addQuestion(@RequestParam String question, @RequestParam String answer) {
        return questionService.add(question, answer);
    }

    @GetMapping(path = "/java/remove")
    public Question removeQuestion(@RequestParam String question, @RequestParam String answer) {
        return questionService.remove(question,answer);
    }

    @GetMapping(path = "/java/random")
    public Question getRandomQuestion() {
        return questionService.getRandomQuestion();
    }
}
