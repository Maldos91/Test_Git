package SOLID;

public class Acer extends Computer {

    Acer(String name, int memory_size) {
        super(name, memory_size);
    }

    @Override
    public void setData(String string) {
        super.setData(string);
        memory_size = 80000;
    }
}
