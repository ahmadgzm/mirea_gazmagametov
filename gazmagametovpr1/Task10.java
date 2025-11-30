package gazmagametovpr1;// gazmagametovpr1.Task10.java
import java.util.Scanner;

public class Task10 {
    public static int reverse(int n, int rev) {
        if (n == 0) return rev;
        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n, 0));
    }
}