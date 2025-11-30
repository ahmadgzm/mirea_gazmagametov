package gazmagametovpr1;// gazmagametovpr1.Task14.java
import java.util.Scanner;

public class Task14 {
    public static void printDigitsLeftToRight(int n) {
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            printDigitsLeftToRight(n / 10);
            System.out.print(n % 10 + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDigitsLeftToRight(n);
        System.out.println();
    }
}