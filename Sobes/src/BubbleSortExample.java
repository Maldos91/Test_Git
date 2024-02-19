import java.util.Arrays;

public class BubbleSortExample {

    //  Plane Bubble sort example

    public static int[] bubbleSort(int[] myArray) {

        int temp = 0;  //  временная переменная для замены
        int counter = 0;  //  переменная для подсчета шагов

        for (int i = 0; i < myArray.length; i++) {
            counter = i + 1;
            for (int j = 1; j < (myArray.length - i); j++) {

                if (myArray[j - 1] > myArray[j]) { //  замена элементов массива через временную переменную
                    temp = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        System.out.println("Steps quantity, non optimized = " + counter);
        return myArray;
    }
    //  Оптимизированная пузырьковая сортировка

    static int[] optimizedBubbleSort(int myArray[]) {
        int temp;
        boolean swapped;
        int counter = 0;  //  переменная для подсчета шагов
        for (int i = 0; i < myArray.length - 1; i++) {
            counter = i + 1;
            swapped = false;
            for (int j = 0; j < myArray.length - i - 1; j++) {
                if (myArray[j] > myArray[j + 1]) { //  swap arr[j] and arr[j+1]
                    temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                    swapped = true;

                }
            }  //  counter = i;
            //  If there weren't elements to swap in inner loop, then break
            if (swapped == false) {

                break;
            }
        }
        System.out.println("steps quantity, optimized = " + counter);
        return myArray;
    }


    public static void main(String[] args) {
        int arr[] = {8, 7, 1, 2, 5, 12, 4};
        int arr1[] = {8, 7, 1, 2, 5, 12, 4};

        System.out.println("Array arr Before Bubble Sort");
        System.out.println(Arrays.toString(arr));

        System.out.println("Array arr After Bubble Sort");
        System.out.println(Arrays.toString(bubbleSort(arr)));

        System.out.println("Array arr1 Before Optimized Bubble Sort");
        System.out.println(Arrays.toString(arr1));

        System.out.println("Array arr1 After Optimized Bubble Sort");
        System.out.println(Arrays.toString(optimizedBubbleSort(arr1)));
    }
}