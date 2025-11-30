package gazmagametovpr1;// gazmagametovpr1.Task7.java
import java.util.Scanner;

public class Task7 {
    public static void factorize(int n, int divisor) {
        if (n == 1) return;
        if (n % divisor == 0) {
            System.out.print(divisor + " ");
            factorize(n / divisor, divisor);
        } else {
            factorize(n, divisor + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorize(n, 2);
        System.out.println();
    }
}