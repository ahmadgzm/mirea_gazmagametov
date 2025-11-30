package gazmagametovpr1;// gazmagametovpr1.Task16.java
import java.util.Scanner;

public class Task16 {
    private static Scanner sc = new Scanner(System.in);

    // Возвращает массив: [max, count]
    public static int[] maxAndCount() {
        int x = sc.nextInt();
        if (x == 0) {
            return new int[] {Integer.MIN_VALUE, 0};
        }
        int[] rest = maxAndCount();
        int max = rest[0];
        int count = rest[1];

        if (x > max) {
            return new int[] {x, 1};
        } else if (x == max) {
            return new int[] {max, count + 1};
        } else {
            return rest;
        }
    }

    public static void main(String[] args) {
        int[] result = maxAndCount();
        System.out.println(result[1]);
    }
}