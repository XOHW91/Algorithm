import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");

        int max = 0;
        int min = 0;

        for (int i = 0; i < N; i++) {

            if (i==0) { // 첫바퀴에는 무조건 첫번째 값으로 세팅
                max = Integer.parseInt(arr[i]);
                min = Integer.parseInt(arr[i]);
            } else {
                max = max < Integer.parseInt(arr[i]) ? Integer.parseInt(arr[i]) : max;
                min = min > Integer.parseInt(arr[i]) ? Integer.parseInt(arr[i]) : min;
            }
        }
        System.out.println(min + " " + max);
    }
}