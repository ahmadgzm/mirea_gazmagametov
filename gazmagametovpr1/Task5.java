package gazmagametovpr1;// gazmagametovpr1.Task5.java
import java.util.Scanner;

public class Task5 {
    public static int digitSum(int n) {
        if (n == 0) return 0;
        return n % 10 + digitSum(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digitSum(n));
    }
}