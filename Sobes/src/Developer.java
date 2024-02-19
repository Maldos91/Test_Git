import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Developer {
    private String name;
    private int age;

    public Developer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void programming() {
        System.out.println(toString() + "Я пишу программу");
    }

    @Override
    public String toString() {
        return "Я " + name + ", мне " + age + ". " ;
    }
}

class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("Дмитрий", 34);

        Developer javaDeveloper = new JavaDeveloper("Александр", 31);
        Developer pythonDeveloper = new PythonDeveloper("Валентин", 33);

        List<Developer> developers = Arrays.asList(developer, javaDeveloper, pythonDeveloper);

        for (Developer d:developers) {
            d.programming();
        }

    }
}
