import java.util.stream.IntStream;

public class FizzBuzz {
    public static int max = 21;

    public static void main(String[] args) {
        newJava1(max);
    }

    public static void oldJava (int a) {
        for (int i = 1; i < a; i++) {
            if (((i%3)==0) && ((i%5)==0)) {
                System.out.println("FizzBuzz");
            }else if ((i%3)==0) {
                System.out.println("Fizz");
            } else if ((i%5)==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void fizzBuzzPrint(int a){
        for (int i = 1; i < a; i++) {
            if ((i % 3) == 0) {
                if ((i % 5) == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if ((i % 5) == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void newJava (int a) {
        IntStream.rangeClosed(1, 21)
                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }

    public static void  newJava1 (int a) {
        IntStream.rangeClosed(1,31)
                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }
}
