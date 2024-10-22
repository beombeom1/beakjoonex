package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();

        int r1 = (n1+n2+n3+n4+n5)/5;

        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(n1);
        num.add(n2);
        num.add(n3);
        num.add(n4);
        num.add(n5);
        Collections.sort(num);

        System.out.println(r1);
        System.out.println(num.get(2));
    }
}
