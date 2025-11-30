package gazmagametovpr1;

import java.util.Scanner;

    public class Task2 {
        public static void printUpTo(int n) {
            if (n <= 0) return;
            printUpTo(n - 1);
            System.out.print(n + " ");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printUpTo(n);
            System.out.println();
        }
    }
