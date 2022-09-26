package courswork.two.questions.services;

import courswork.two.questions.model.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    @Mock
    private JavaQuestionService javaService;
    @InjectMocks
    private ExaminerServiceImpl examService;

    @BeforeEach
    void setUp() {
        Question q = new Question("К какому типу переменных относится byte?",
                "Тип byte относится к примитивному типу.");
        List<Question> listTest = new ArrayList<>(List.of(
                new Question("К какому типу переменных относится byte?",
                        "Тип byte относится к примитивному типу."),
                new Question("Верно ли определение полиморфизма: " +
                        "возможность применения одноименных методов " +
                        "с одинаковыми или различными наборами параметров " +
                        "в одном классе или в группе классов, связанных отношением наследования.",
                        "Да, верно!"),
                new Question("Что такое инкапсуляция?",
                        "Сокрытие реализации класса и отделение его внутреннего представления " +
                                "от внешнего (интерфейса)")));
        Mockito.when(javaService.getRandomQuestion(2)).
                thenReturn(listTest.get(0),listTest.get(1),listTest.get(2));
    }

    @Test
    void getQuestions() {
        List<Question> actualList = examService.getQuestions(2);
        List<Question> listTest = new ArrayList<>(List.of(
                new Question("К какому типу переменных относится byte?",
                        "Тип byte относится к примитивному типу."),
                new Question("Верно ли определение полиморфизма: " +
                        "возможность применения одноименных методов " +
                        "с одинаковыми или различными наборами параметров " +
                        "в одном классе или в группе классов, связанных отношением наследования.",
                        "Да, верно!"),
                new Question("Что такое инкапсуляция?",
                        "Сокрытие реализации класса и отделение его внутреннего представления " +
                                "от внешнего (интерфейса)")));
        assertEquals(listTest,actualList);
    }
}