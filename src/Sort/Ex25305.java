package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Ex25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);  // 학생 수
        int k = Integer.parseInt(s[1]);  // 커트라인 등수

        ArrayList<Integer> scores = new ArrayList<>();
        String[] scoreStrings = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            scores.add(Integer.parseInt(scoreStrings[i]));
        }

        Collections.sort(scores, Collections.reverseOrder());

        System.out.println(scores.get(k - 1));
    }
}
