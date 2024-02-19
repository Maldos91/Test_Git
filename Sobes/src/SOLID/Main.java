package SOLID;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer("IBM", 800000);
        SaveComputerToFile saver = new SaveComputerToFile();
        saver.save("out.dat", comp);
    }

    public void test() {
        Computer comp = new Computer("Ibm", 50000);
        Computer comp2 = new Acer("Acer 3", 60000);

        comp2.setData("Acer 3");
    }
}

/*class Emplyee {
    int getSalary() {return 1000;}
    void cook(){}
    void cleanFloor() {}
    void deliverFood() {}
}*/
/*class Employee {
    int getSalary() {return 100;}
}
class Cook extends Employee {
    void cook(){}
}

class Janitor extends Employee {
    void cleanFloor() {}
}

class EmployeeFacade {
    Cook cook = new Cook();
    Janitor jan = new Janitor();
    void cook() {
        cook.cook();
    }
    void clean() {
        jan.cleanFloor();
    }
}*/