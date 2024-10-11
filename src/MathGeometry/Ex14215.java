package MathGeometry;

import java.util.Scanner;

public class Ex14215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        int sum = a + b + c;

        if (sum - max <= max) {
            sum = (a + b + c) - max + (sum - max - 1);
        }

        System.out.println(sum);
    }
}
