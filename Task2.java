import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean horseGo = false;
        System.out.print("Input a number on board, where position horse ");
        int m = in.nextInt();
        System.out.print("Input a letter on board, where position horse ");
        char n = in.next().charAt(0);
        System.out.print("Input number,where to you want to position horse ");
        int a = in.nextInt();
        System.out.print("Input number,where to you want to position horse ");
        char b = in.next().charAt(0);
        int nInt, bInt;
        switch (n & b) {
            case 'a':
                nInt = 1;
                bInt = 1;
                break;
            case 'b':
                nInt = 2;
                bInt = 2;
                break;
            case 'c':
                nInt = 3;
                bInt = 3;
                break;
            case 'd':
                nInt = 4;
                bInt = 4;
                break;
            case 'e':
                nInt = 5;
                bInt = 5;
                break;
            case 'f':
                nInt = 6;
                bInt = 6;
                break;
            case 'g':
                nInt = 7;
                bInt = 7;
                break;
            case 'h':
                nInt = 8;
                bInt = 8;
                break;
            default:
                System.out.println("The сhess board doesn't have this letter");
                break;
        }
        if (a == m - 1 || a == m + 1) {
            if (b == n + 2 || b == n - 2) {
                horseGo = true;
            }
        }
        if (a == m - 2 || a == m + 2) {
            if (b == n + 1 || b == n - 1) {
                horseGo = true;
            }
        }
        System.out.println("The horse go: " + horseGo);

    }
}

