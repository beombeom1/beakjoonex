package Deepen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < line; i++) {
            String word = br.readLine();
            ArrayList<Character> arrayList = new ArrayList<>();
            boolean isGroupWord = true;

            for (int j = 0; j < word.length(); j++) {
                if (j > 0 && word.charAt(j) != word.charAt(j - 1) && arrayList.contains(word.charAt(j))) {
                    isGroupWord = false;
                    break;
                }
                arrayList.add(word.charAt(j));
            }
            if (isGroupWord) {
                count++;
            }
        }

        System.out.println(count);
    }
}
