package Stream;

public class Palindrome {

    public static String str = "asdsa";

    public static void main(String[] args) {

        System.out.println(isPalindromeString(str));

        System.out.println(isPalindrom(str));
    }

    public static boolean isPalindromeString(String str) {
        if (str == null)
            return false;
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }

    private static boolean isPalindrom(String str) {
        if (str == null)
            return false;
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        return strBuilder.toString().equals(str);
    }
}
