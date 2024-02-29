import java.util.Stack;

public class Maincraftung {

        public static void main(String[] args) {
            String input = "cdffde";
            System.out.println(removeAdjacentDuplicates(input));  // Вывод: "c"
        }

        public static String removeAdjacentDuplicates(String s) {
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                if (!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            StringBuilder sb = new StringBuilder();
            for (char c : stack) {
                sb.append(c);
            }

            return sb.toString();
        }
    }