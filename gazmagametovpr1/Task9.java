package gazmagametovpr1;// gazmagametovpr1.Task9.java
import java.util.Scanner;

public class Task9 {

    public static int countSequences(int a, int b, int last) {
        if (a == 0 && b == 0) return 1;
        int total = 0;
        if (b > 0) {
            total += countSequences(a, b - 1, 1);
        }
        if (a > 0 && last != 0) {
            total += countSequences(a - 1, b, 0);
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(countSequences(a, b, -1));
    }
}
