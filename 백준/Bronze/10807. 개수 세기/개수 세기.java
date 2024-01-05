import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 둘째줄 입력받은 숫자들을 공백 기준으로 잘라
        for (int i = 0; i < arr.length; i++) { // 배열의 개수만큼 돌면서 st에 있는 숫자를 배열에 넣음.
            arr[i] = st.nextToken();
        }

        String find = br.readLine();
        int count = 0;
        for (String s : arr) {
            if (s.equals(find)){
                count++;
            }
        }

        System.out.println(count);
    }
}
