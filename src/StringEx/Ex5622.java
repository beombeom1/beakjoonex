package StringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] word = br.readLine().split("");
        int R = 0;
        for(int i = 0; i < word.length; i++) {
            switch(word[i]) {
                case "A":
                case "B":
                case "C":
                    R += 3;
                    break;
                case "D":
                case "E":
                case "F":
                    R += 4;
                    break;
                case "G":
                case "H":
                case "I":
                    R += 5;
                    break;
                case "J":
                case "K":
                case "L":
                    R += 6;
                    break;
                case "M":
                case "N":
                case "O":
                    R += 7;
                    break;
                case "P":
                case "Q":
                case "R":
                case "S":
                    R += 8;
                    break;
                case "T":
                case "U":
                case "V":
                    R += 9;
                    break;
                case "W":
                case "X":
                case "Y":
                case "Z":
                    R += 10;
                    break;
            }
        }
        System.out.println(R);
    }
}
