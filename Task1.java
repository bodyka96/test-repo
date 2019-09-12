import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array[] = new int[5];
        int count = 0;
        addArray(array);
        sortedArray(array);
        count = counter(array);
        System.out.println("The count of different elements: " + count);

    }

    private static void addArray(int array[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Add elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
    }

    private static void sortedArray(int array[]) {
        int temp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static int counter(int array[]) {
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                count++;
            }
        }
        return count;
    }
}
