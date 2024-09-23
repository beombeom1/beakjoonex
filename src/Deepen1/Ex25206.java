package Deepen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Double> list = new ArrayList<>();
        double score = 0.0;
        double score2 = 0.0;

        for (int i = 0; i < 20; i++) {
            String[] s = br.readLine().split(" ");
            if (s[2].equals("P")) {
                continue;
            }

            double credits = Double.parseDouble(s[1]);
            list.add(credits);
            score2 += credits;

            switch (s[2]) {
                case "A+":
                    list.add(4.5);
                    break;
                case "A0":
                    list.add(4.0);
                    break;
                case "B+":
                    list.add(3.5);
                    break;
                case "B0":
                    list.add(3.0);
                    break;
                case "C+":
                    list.add(2.5);
                    break;
                case "C0":
                    list.add(2.0);
                    break;
                case "D+":
                    list.add(1.5);
                    break;
                case "D0":
                    list.add(1.0);
                    break;
                case "F":
                    list.add(0.0);
                    break;
            }
        }

        for (int i = 0; i < list.size(); i += 2) {
            score += list.get(i) * list.get(i + 1);
        }

        if (score2 > 0) {
            System.out.println(score / score2);
        } else {
            System.out.println("0.0");
        }
    }
}
