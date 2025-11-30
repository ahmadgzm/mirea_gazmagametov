package gazmagametovpr1;// gazmagametovpr1.Task13.java
import java.util.Scanner;

public class Task13 {
    private static Scanner sc = new Scanner(System.in);


    public static void printOddPositions(boolean isOddPosition) {
        int x = sc.nextInt();
        if (x == 0) return;
        if (isOddPosition) {
            System.out.println(x);
        }
        printOddPositions(!isOddPosition);
    }

    public static void main(String[] args) {
        printOddPositions(true);
    }
}
