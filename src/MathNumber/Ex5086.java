package MathNumber;

import java.util.Scanner;

public class Ex5086 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        while (true){
            int a1 = s.nextInt();
            int a2 = s.nextInt();
            if(a1==0 && a2==0){
                break;
            }
            if(a1 > a2){
                if(a1 % a2 == 0){
                    System.out.println("multiple");
                }else {
                    System.out.println("neither");
                }
            }else {
                if(a2 % a1 == 0){
                    System.out.println("factor");
                }else {
                    System.out.println("neither");
                }
            }
        }
    }
}
