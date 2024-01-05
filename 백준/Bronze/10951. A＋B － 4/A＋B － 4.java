import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * 반복문에서 끝맺음 구간이 보이지 않는 경우에는
         * EOF 처리를 해주어야 함. (End of File)
         */

        // BufferedReader를 사용할 경우
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = br.readLine();

            // EOF 및 빈 문자열 체크 - 입력받은 값이 널이거나 비어있으면 break
            if (line == null || line.trim().isEmpty()) {
                break;
            }

            // 그게 아니라면 st사용해서 공백기준으로 문자열 자르고
            StringTokenizer st = new StringTokenizer(line, " ");

            // 한번 더 토큰이 있는지 체크
            if (st.hasMoreTokens()) {
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                bw.write(String.valueOf(A+B) + "\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    } 
}