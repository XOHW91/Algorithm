import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 우선 테스트 케이스는 몇 개가 주어질 지 모름. ==> while문
        // 0 0이 기입되는 순간 종료.
        boolean flag = true;
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                // 0 0이 입력되면 종료
                break;
            }

            bw.write((a + b) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
