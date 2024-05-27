package IfEx;

import java.util.Scanner;

public class Ex2884 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int H, M;
        H = s.nextInt();
        M = s.nextInt();
        if(M>=45){
            System.out.println(H + " " + (M-45));
        } else if (H!=0&&M<45) {
            System.out.println((H-1) + " " + (M-45+60));
        }else System.out.println(23 + " " + (M-45+60));
    }
}
