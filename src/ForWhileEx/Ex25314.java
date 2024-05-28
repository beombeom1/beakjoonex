package ForWhileEx;

import java.util.Scanner;

public class Ex25314 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N, M;
        N = s.nextInt();
        M = N / 4;
        for (int i = 0; i < M; i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
