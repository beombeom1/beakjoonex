package IfEx;

import java.util.Scanner;

public class Ex2525 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A, B, C, D, E;
        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();
        D = (B + C) / 60;
        E = (B + C) % 60;
        if(B+C<60){
            System.out.println(A + " " + (B + C));
        }else if (A+D<24){
            System.out.println((A + D) + " " + E);
        }else
            System.out.println((A + D - 24) + " " + E);
    }
}
