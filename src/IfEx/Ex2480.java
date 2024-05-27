package IfEx;

import java.util.Scanner;

public class Ex2480 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A, B, C;
        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();
        if (A==B && B==C && A==C){
            System.out.println(10000 + A * 1000);
        } else if (A==B && B!=C) {
            System.out.println(1000 + 100 * A);
        } else if (B==C && B!=A) {
            System.out.println(1000 + 100 * B);
        } else if (A==C && B!=C) {
            System.out.println(1000 + 100 * A);
        } else if(C<B&&A<B){
            System.out.println(B*100);
        } else if(C<A&&B<A){
            System.out.println(A*100);
        } else
            System.out.println(C * 100);
    }
}
