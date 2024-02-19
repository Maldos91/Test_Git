package SOLID;

public class Computer {
    String name;
    int memory_size;

    Computer(String name, int memory_size) {
        this.name = name;
        this.memory_size = memory_size;
    }

    public void setData(String string) {
        this.name = string;
    }

//    public void save() {
//        System.out.println("Сохранение объекта класса в файл");
//    }
//
//    public void load() {
//        System.out.println("Загрузка объекта класса из файла");
//    }
}
