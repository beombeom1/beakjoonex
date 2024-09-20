package Deepen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().toLowerCase().split("");
        int[] num = new int[26];
        int max = 0;
        int count = 1;
        int firstIndex = -1;

        for (int i = 0; i < s.length; i++) {
            switch (s[i]) {
                case "a":
                    num[0] += 1; break;
                case "b":
                    num[1] += 1; break;
                case "c":
                    num[2] += 1; break;
                case "d":
                    num[3] += 1; break;
                case "e":
                    num[4] += 1; break;
                case "f":
                    num[5] += 1; break;
                case "g":
                    num[6] += 1; break;
                case "h":
                    num[7] += 1; break;
                case "i":
                    num[8] += 1; break;
                case "j":
                    num[9] += 1; break;
                case "k":
                    num[10] += 1; break;
                case "l":
                    num[11] += 1; break;
                case "m":
                    num[12] += 1; break;
                case "n":
                    num[13] += 1; break;
                case "o":
                    num[14] += 1; break;
                case "p":
                    num[15] += 1; break;
                case "q":
                    num[16] += 1; break;
                case "r":
                    num[17] += 1; break;
                case "s":
                    num[18] += 1; break;
                case "t":
                    num[19] += 1; break;
                case "u":
                    num[20] += 1; break;
                case "v":
                    num[21] += 1; break;
                case "w":
                    num[22] += 1; break;
                case "x":
                    num[23] += 1; break;
                case "y":
                    num[24] += 1; break;
                case "z":
                    num[25] += 1; break;
            }
        }

        for (int j = 0; j < num.length; j++) {
            if (num[j] > max) {
                max = num[j];
                count = 1;
                firstIndex = j;
            } else if (num[j] == max) {
                count++;
            }
        }

        if (count == 1) {
            System.out.println((char) (firstIndex + 65));
        } else {
            System.out.println("?");
        }
    }
}
