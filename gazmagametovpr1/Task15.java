package gazmagametovpr1;// gazmagametovpr1.Task15.java
import java.util.Scanner;

public class Task15 {
    public static void printDigitsRightToLeft(int n) {
        if (n == 0) return;
        System.out.print(n % 10 + " ");
        printDigitsRightToLeft(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDigitsRightToLeft(n);
        System.out.println();
    }
}