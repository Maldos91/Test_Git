import java.util.*;

public class MainSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                evens.add(num);
            } else {
                odds.add(num);
            }
        }

        evens.addAll(odds);

        for (int num : evens) {
            System.out.print(num + " ");
        }
    }
}
