package SOLID;

public class SaveComputerToFile implements SaveInterface {

    public void save (String path, Computer comp) {
        System.out.println("Сохранение в файл " +path+ ", "+comp);
    }

}
