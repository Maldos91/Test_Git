import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    static int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {

        int x = (int) (Math.random()*10)+1;
        System.out.println(binarySearch(array, x));
    }
    public static Integer binarySearch(int[] array, int a) {
        int low = 0;
        int high = array.length-1;

        while (low <= high) {
            int mid = low + (high-low)/2;
            int result = array[mid];

            if (result == a) {
                return mid;
            }
            if (result > a) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }
}
