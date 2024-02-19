package Calc;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int x = 1221;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revers = 0;
        while (x > revers) {
            revers = revers * 10 + x % 10;
            x /= 10;
        }
        return x == revers || x == revers / 10;
    }
}