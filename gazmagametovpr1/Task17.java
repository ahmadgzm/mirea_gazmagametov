package gazmagametovpr1;// gazmagametovpr1.Task17.java
import java.util.Scanner;

public class Task17 {
    private static Scanner sc = new Scanner(System.in);

    public static int findMax() {
        int x = sc.nextInt();
        if (x == 0) {
            return Integer.MIN_VALUE;
        }
        int maxRest = findMax();
        return Math.max(x, maxRest);
    }

    public static void main(String[] args) {
        int max = findMax();
        System.out.println(max);
    }
}