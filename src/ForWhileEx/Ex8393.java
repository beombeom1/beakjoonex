package ForWhileEx;

import java.util.Scanner;

public class Ex8393 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, m;
        m = 0;
        n = s.nextInt();
        for(int i = 1; i<=n; i++){
            m += i;
        }
        System.out.println(m);
    }
}
