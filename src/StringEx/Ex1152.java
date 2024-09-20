package StringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().trim().split(" ");
        if(arr.length==1 && arr[0].equals("")){
            System.out.println("0");
        }else {
            System.out.println(arr.length);
        }
    }
}
