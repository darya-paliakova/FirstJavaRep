import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ArraysHomework {
    public static void getAverage(){
        System.out.println("\nTask 1, solution 1");
        int[] array = new int[55];
        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = i;
            sum += array[i];
        }

        int average = sum / array.length;
        System.out.println("Average of array from 0 to 54 is " + average);
    }

    public static void getAverageAsDouble(){
        System.out.println("\nTask 1, solution 2");
        int[] array = new int[55];
        Arrays.setAll(array, element -> element > array.length ? 0 : element);
        System.out.println("Average of array from 0 to 54 is " + IntStream.of(array).average().getAsDouble());
    }

    public static void findMaxElement(){
        System.out.println("\nTask 2, solution 1");
        int[] array = new int[15];
        Random random = new Random();

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        System.out.println("The array is:\n" + Arrays.toString(array));

        int maxValue = array[0];
        for (int element : array) {
            if (element > maxValue) maxValue = element;
        }
        System.out.println("The max value from array is " + maxValue);
    }

    public static void findMaxElementBySorting(){
        System.out.println("\nTask 2, solution 2");
        int[] array = new int[15];
        Random random = new Random();
        Arrays.setAll(array, element -> element > array.length ? 0 : random.nextInt(100));
        System.out.println("The array is:\n" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("The max value from array is " + array[array.length - 1]);
    }

    public static void findMaxElementByIntStream(){
        System.out.println("\nTask 2, solution 3");
        int[] array = new int[15];
        Random random = new Random();
        Arrays.setAll(array, element -> element > array.length ? 0 : random.nextInt(100));
        System.out.println("The array is:\n" + Arrays.toString(array));
        System.out.println("The max value from array is " + IntStream.of(array).max().getAsInt());
    }
}
