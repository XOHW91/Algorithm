import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스 입력받음.
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        // 각 줄에 A와 B가 주어지며, Case #1 : 2 이렇게 합이 출력 됨.
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " "); // enter 기준으로 한 줄씩 받게되며, 공백 기준으로 문자를 자름.
            String A = st.nextToken();
            String B = st.nextToken();

            bw.write("Case #" + (i + 1) + ": " + A + " + " + B + " = " + (Integer.parseInt(A) + Integer.parseInt(B)) + "\n");
        }

        // bw에 저장된 데이터 한꺼번에 출력함.
        bw.flush();

    }
}

