package SOLID;

public class Open_Closed {
    public static void main(String[] args) {
//        Toyota toyota = new Toyota();
        Celica celica = new Celica();
        workInTaxi(celica);
    }
    static void workInTaxi (Toyota toyota) {
        if (!(toyota instanceof Celica)) {
            toyota.getPassengers();
        } else {
            toyota.getPassenger();
        }
    }
}
interface Car {
    void workInTaxi();
}
class Toyota implements  Car{
    void getPassengers() {
        System.out.println("get Passengers");
    }
    void getPassenger() {
        System.out.println("get one Passengers");
    }

    @Override
    public void workInTaxi() {
        getPassengers();
    }
}

class Celica extends Toyota {
    public void workInTaxi() {
        getPassenger();
    }

    @Override
    void getPassenger() {
        System.out.println("get one Passengers");
    }
}