package gazmagametovpr1;// gazmagametovpr1.Task1.java
import java.util.Scanner;

public class Task1 {
    public static void printTriangle(int n, int currentNum, int count) {
        if (n <= 0) return;
        if (count < currentNum) {
            System.out.print(currentNum + " ");
            printTriangle(n - 1, currentNum, count + 1);
        } else {
            printTriangle(n, currentNum + 1, 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTriangle(n, 1, 0);
        System.out.println();
    }
}
