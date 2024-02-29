import java.util.*;
import java.io.*;

import java.util.*;
import java.io.*;

public class MainShifr {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] candidates = new String[n];
        for (int i = 0; i < n; i++) {
            candidates[i] = reader.readLine();
        }
        StringBuilder output = new StringBuilder();
        for (String candidate : candidates) {
            String[] data = candidate.split(",");
            String fio = data[0] + data[1] + data[2];
            int day = Integer.parseInt(data[3]);
            int month = Integer.parseInt(data[4]);
            output.append(calculateCipher(fio, day, month)).append(" ");
        }
        System.out.println(output.toString().trim());
    }

    private static String calculateCipher(String fio, int day, int month) {
        int uniqueChars = (int) fio.chars().distinct().count();
        int sumDigits = Arrays.stream((day + "" + month).split("")).mapToInt(Integer::parseInt).sum() * 64;
        int firstLetter = (Character.toLowerCase(fio.charAt(0)) - 'a' + 1) * 256;
        int total = uniqueChars + sumDigits + firstLetter;
        String hexTotal = Integer.toHexString(total).toUpperCase();
        while (hexTotal.length() < 3) {
            hexTotal = "0" + hexTotal;
        }
        return hexTotal.substring(hexTotal.length() - 3);
    }
}