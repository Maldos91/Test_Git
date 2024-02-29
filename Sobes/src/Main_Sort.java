import java.util.*;
import java.io.*;

public class Main_Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] numbers = reader.readLine().split(" ");
        Stack<Integer> stack = new Stack<>();
        for (String number : numbers) {
            stack.push(Integer.parseInt(number));
        }
        int lastEven = -1;
        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (num % 2 == 0) {
                lastEven = num;
                break;
            }
        }
        System.out.println(lastEven);
    }
}