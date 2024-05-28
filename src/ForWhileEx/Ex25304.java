package ForWhileEx;

import java.util.Scanner;

public class Ex25304 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int X, N, a, b;
        X = s.nextInt();
        N = s.nextInt();
        for(int i = 0; i < N; i++){
            a = s.nextInt();
            b = s.nextInt();
            X -= a * b;
        }
        if(X == 0){
            System.out.println("Yes");
        }else
            System.out.println("No");
    }
}
