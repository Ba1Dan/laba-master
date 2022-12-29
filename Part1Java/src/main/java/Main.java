import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int sizeArray = Integer.parseInt(args[0]);
        System.out.println("Start...");
        final int[] arr =  new int[sizeArray];
        fillArray(arr);
        printArray(arr);
        System.out.println("End.");
    }

    public static void fillArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}


