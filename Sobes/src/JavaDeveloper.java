public class JavaDeveloper extends Developer {
    public JavaDeveloper(String name, int age) {
        super(name, age);
    }
    // переопределение метода базового класса
    @Override
    public void programming() {
        System.out.println( toString() + "Я пишу программу на Java");
    }
}
