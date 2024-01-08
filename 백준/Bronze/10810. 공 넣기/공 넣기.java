import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        // 바구니 개수와 배열의 개수는 같다.
        int[] arr = new int[N];

        // 공을 넣는 횟수만큼 for문을 돌면서 숫자 3개를 입력받는다. i, j, k
        for (int z = 0; z < M; z++) {
            String[] number = br.readLine().split(" ");
            int i = Integer.parseInt(number[0])-1;
            int j = Integer.parseInt(number[1])-1;
            int k = Integer.parseInt(number[2]);
            for (int a = i; a < j+1; a++) {
                // i=1 , j=2 ===> 0번 배열부터 1번 배열까지 숫자 3을 넣어라.
                arr[a] = k;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
