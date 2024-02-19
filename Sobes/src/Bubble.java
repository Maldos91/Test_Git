import java.util.Arrays;

public class Bubble {

    public static int[] array = {16,4,23,42,15,8};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sort(array)));
    }
    public static int [] sort(int[] array){
        int z = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++){
                if (array[j] > array[j+1]){
                    z = array[j+1];
                    array[j+1] = array[j];
                    array[j] = z;
                }
            }
        }
        return array;
    }
}