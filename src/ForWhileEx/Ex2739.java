package ForWhileEx;

import java.util.Scanner;

public class Ex2739 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N;
        N = s.nextInt();
        for(int i = 1; i<10; i++){
            System.out.println(N + " * " + i + " = " + N * i);
        }
    }
}
