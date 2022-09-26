package courswork.two.questions.services;

import courswork.two.questions.model.Question;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {
    private final JavaQuestionService javaService = new JavaQuestionService();
    private final Question extendedQuestion = new Question("Вопрос-проверка","Ответ-проверка");

    private final Set<Question> setTest = new HashSet<>(Set.of(
            new Question("К какому типу переменных относится byte?", "Тип byte относится к примитивному типу."),
            new Question("Верно ли определение полиморфизма: " +
                    "возможность применения одноименных методов " +
                    "с одинаковыми или различными наборами параметров " +
                    "в одном классе или в группе классов, связанных отношением наследования.",
                    "Да, верно!"),
            new Question("Что такое инкапсуляция?", "Сокрытие реализации класса и отделение его внутреннего представления " +
                    "от внешнего (интерфейса)"),
            new Question("Что такое String в Java?", "Класс String в Java предназначен для работы со строками" +
                    " в Java. Все строковые литералы, определенные в Java программе (например, \"abc\") — это экземпляры класса String."),
            new Question("Какая из сортировок является наиболее эффективной?", "Быстрая сортировка является одной " +
                    "из наиболее эффективных из существующих в Java. В её основе лежит рекурсивный алгоритм Quick sort. " +
                    "В среднем сортировка в Java выполняется за время O(n logn), причём точная скорость зависит от выбора опорного элемента."),
            new Question("Существует ли в Java множественное наследование?", "Нет, в java не существует множественной зависимости, " +
                    "но существуют интерфейсы, которые помогают с этим справится."),
            new Question("Что такое бинарный поиск?", "Бинарный поиск — тип поискового алгоритма, " +
                    "который последовательно делит пополам заранее отсортированный массив данных, чтобы обнаружить нужный элемент. " +
                    "Другие его названия — двоичный поиск, метод половинного деления, дихотомия."),
            new Question("Что такое красно-черное дерево?", "Красно-чёрное дерево — один" +
                    " из видов самобалансирующихся двоичных деревьев поиска, гарантирующих логарифмический " +
                    "рост высоты дерева от числа узлов и позволяющее быстро выполнять основные операции дерева" +
                    " поиска: добавление, удаление и поиск узла."),
            new Question("Что такое Maven?", "Maven — инструмент для автоматизации сборки проектов." +
                    " С ним работают в основном Java-разработчики, хотя есть плагины для интеграции с C/C++, " +
                    "Ruby, Scala, PHP и другими языками. В статье будут рассмотрены особенности и область применения Maven," +
                    " описан процесс установки и начала работы, а также разобрана структура файла описания проекта.")));
    @Test
    void addQuestionReturn() {
        assertEquals(extendedQuestion,javaService.add("Вопрос-проверка","Ответ-проверка"));
    }
    @Test
    void addQuestionDoesItContain(){
        javaService.add("Вопрос-проверка","Ответ-проверка");
        assertTrue(javaService.getAll().contains(extendedQuestion));
    }

    @Test
    void removeQuestionReturn() {
        assertEquals(extendedQuestion,javaService.add("Вопрос-проверка","Ответ-проверка"));
    }
    @Test
    void removeQuestionDoesItContain(){
        javaService.remove("Существует ли в Java множественное наследование?", "Нет, в java не существует множественной зависимости, " +
                "но существуют интерфейсы, которые помогают с этим справится.");
        assertFalse(javaService.getAll().contains(new Question("Существует ли в Java множественное наследование?", "Нет, в java не существует множественной зависимости, " +
                "но существуют интерфейсы, которые помогают с этим справится.")));
    }
    @Test
    void checkSizeAfterRemove(){
        int extended = javaService.getAll().size()-1;
        javaService.remove("Существует ли в Java множественное наследование?", "Нет, в java не существует множественной зависимости, " +
                "но существуют интерфейсы, которые помогают с этим справится.");
        assertEquals(extended, javaService.getAll().size());
    }

    @Test
    void getAll() {
        assertEquals(setTest,javaService.getAll());
    }

    @Test
    void getRandomQuestionThrowException() {
        assertThrows(RuntimeException.class,()->javaService.
                getRandomQuestion(javaService.getAll().size()+1));
    }
}