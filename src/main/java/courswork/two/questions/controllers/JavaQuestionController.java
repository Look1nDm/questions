package courswork.two.questions.controllers;

import courswork.two.questions.model.Question;
import courswork.two.questions.services.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "/exam/java")
public class JavaQuestionController {
    private final QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public Collection<Question> printAll() {
        return questionService.getAll();
    }

    @GetMapping(path = "/add")
    public Question addQuestion(@RequestParam String question, @RequestParam String answer) {
        return questionService.add(question, answer);
    }

    @DeleteMapping(path = "/remove")
    public Question removeQuestion(@RequestParam String question, @RequestParam String answer) {
        return questionService.remove(question,answer);
    }
}
