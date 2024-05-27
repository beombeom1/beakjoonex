package IfEx;

import java.util.Scanner;

public class Ex2753 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A;
        A = s.nextInt();
        if(A%4==0&&A%100!=0){
            System.out.println("1");
        } else if (A%400==0) {
            System.out.println("1");
        }else System.out.println("0");
    }
}
