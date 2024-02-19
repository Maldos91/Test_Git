package SOLID;

public class SaveComputerToDB implements SaveInterface {
    public void save (String path, Computer comp) {
        System.out.println("Сохранение в файл " +path+ ", "+comp);
    }

}
