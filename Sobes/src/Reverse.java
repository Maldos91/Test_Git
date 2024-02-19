import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {
    public static int[] array = {4,8,15,16,23,42};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(reverse(array)));

        reverse(new int[] {1,2});
    }

    public static int[] revers (int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }

    public static void reverse (int[] arr) {

        String str = new String("sdfdfsfds");

        System.out.println(str.replace("s", "x"));
        List.of(arr);
//        List<> list = Arrays.asList(arr);
//        Collections.reverse(list);
//        return  list.toArray(arr);
        System.out.println("fffff");
    }
}