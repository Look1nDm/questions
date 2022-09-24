package services;

import model.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    private final Set<Question> questions;

    public JavaQuestionService() {
        this.questions = new HashSet<>(Set.of(
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
    }

    @Override
    public Question add(String question, String answer) {
        Question q = new Question(question, answer);
        questions.add(q);
        return q;
    }

    @Override
    public Question add(Question question) {
        return null;
    }

    @Override
    public Question remove(String question, String answer) {
        return null;
    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }

    @Override
    public Question getRandomQuestion() {
        List<Question> list = new ArrayList<>();

        return null;
    }
}
