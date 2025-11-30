package gazmagametovpr1;// gazmagametovpr1.Task3.java
import java.util.Scanner;

public class Task3 {
    public static void printRange(int a, int b) {
        if (a <= b) {
            System.out.print(a + " ");
            if (a < b) printRange(a + 1, b);
        } else {
            System.out.print(a + " ");
            if (a > b) printRange(a - 1, b);
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите два числа:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printRange(a, b);
        System.out.println();
    }
}
