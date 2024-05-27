package Ex;

import java.util.Scanner;

public class Ex2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D, E;
        A = sc.nextInt();
        B = sc.nextInt();
        C = B / 100;
        D = (B / 10) % 10;
        E = B % 10;
        System.out.println(A * E);
        System.out.println(A * D);
        System.out.println(A * C);
        System.out.println((A * E) + (A * D * 10) + (A * C * 100));
    }
}
