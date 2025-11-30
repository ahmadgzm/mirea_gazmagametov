package gazmagametovpr1;// gazmagametovpr1.Task11.java
import java.util.Scanner;

public class Task11 {
    private static Scanner sc = new Scanner(System.in);

    public static int countOnes() {
        int first = sc.nextInt();
        if (first == 0) {
            int second = sc.nextInt();
            if (second == 0) {
                return 0; // конец
            } else {
                // был 0, потом не 0 - продолжаем,
                return (second == 1 ? 1 : 0) + countOnesRest();
            }
        } else {
            return (first == 1 ? 1 : 0) + countOnes();
        }
    }

    // продолжение после чтения одного числа
    public static int countOnesRest() {
        int x = sc.nextInt();
        if (x == 0) {
            int y = sc.nextInt();
            if (y == 0) return 0;
            return (y == 1 ? 1 : 0) + countOnesRest();
        } else {
            return (x == 1 ? 1 : 0) + countOnesRest();
        }
    }

    public static void main(String[] args) {
        System.out.println(countOnes());
    }
}
