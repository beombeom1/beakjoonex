package MathNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();

        if (s == 1) {

        } else {
            while (s > 1) {
                int i = 2;
                while (i <= s) {
                    if (s % i == 0) {
                        s /= i;
                        a.add(i);
                        continue;
                    }
                    i++;
                }
            }
            if (a.size() == 0) {
                System.out.println(s);
            } else {
                for (int i = 0; i < a.size(); i++) {
                    System.out.println(a.get(i));
                }
            }
        }
    }
}
