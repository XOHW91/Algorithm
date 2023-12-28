import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스 입력
        int s = Integer.parseInt(br.readLine());

        for (int i = 0; i < s; i++) { // 라인 찍기 i=0,1,2,3,4 ==> 5줄
            for (int j = s-1; j > i; j--) { // 공백 찍기 4,3,2,1,0 ==> j는 i와 역순으로 가야 함.
                bw.write(" ");
            }

            for (int z = 0; z < i+1; z++) { // 별 찍기 1,2,3,4,5
                bw.write("*");
            }
            bw.write("\n");
            bw.flush();
        }
    }
}
