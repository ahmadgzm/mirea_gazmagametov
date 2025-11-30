package gazmagametovpr1;// gazmagametovpr1.Task12.java
import java.util.Scanner;

public class Task12 {
    private static Scanner sc = new Scanner(System.in);

    public static void printOdds() {
        int x = sc.nextInt();
        if (x == 0) return;
        if (x % 2 == 1) {
            System.out.println(x);
        }
        printOdds();
    }

    public static void main(String[] args) {
        printOdds();
    }
}
