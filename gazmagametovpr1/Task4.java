package gazmagametovpr1;// gazmagametovpr1.Task4.java
import java.util.Scanner;

public class Task4 {
    // pos — текущая позиция (от 0 до k), sum — оставшаяся сумма, isFirst — можно ли ставить 0
    public static long countNumbers(int k, int sum, int pos, boolean isFirst) {
        if (pos == k) {
            return sum == 0 ? 1 : 0;
        }
        if (sum < 0) return 0;

        long total = 0;
        int start = isFirst ? 1 : 0;
        for (int digit = start; digit <= 9; digit++) {
            total += countNumbers(k, sum - digit, pos + 1, false);
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        System.out.println(countNumbers(k, s, 0, true));
    }
}