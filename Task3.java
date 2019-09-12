import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[3][2];
        boolean test = true;
        inputTriangle(array);
        double square = countSquareTriangle(array);
        test = theorema(array);
        System.out.println("Is triangle?" + test);
        if (test == true) {
            System.out.println("The square triangle =  " + square);
        } else {
            System.out.println("Triangle is not valid");
        }
    }

    private static void inputTriangle(int[][] array) {
        Scanner in = new Scanner(System.in);
        int b = 1;
        System.out.println("Input data triangle");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input the point triangle:" + b);
            b++;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = in.nextInt();
            }
            System.out.println("Input next point..");
        }
    }

    private static boolean theorema(int[][] array) {
        boolean triangleIs = true;
        if ((array[0][0] == array[0][1]) == (array[1][0] == array[1][1]) == (array[2][0] == array[2][1])) {
            if (array[0][0] == array[1][0] & array[1][0] == array[2][0]) {
                if (array[0][1] == array[1][1] & array[1][1] == array[2][1]) {
                    triangleIs = false;
                }
            }
        }
        return triangleIs;

    }

    private static double countSquareTriangle(int[][] array) {
        int a = array[0][0] - array[2][0];
        int b = array[1][0] - array[2][0];
        int c = array[0][1] - array[2][1];
        int d = array[1][1] - array[2][1];
        double sum = 1.0 / 2 * ((a * d) - (b * c));
        System.out.println(sum);
        return Math.abs(sum);
    }

}
