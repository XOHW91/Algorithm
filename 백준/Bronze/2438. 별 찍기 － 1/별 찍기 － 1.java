import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int s = Integer.parseInt(br.readLine());
        // i=0 별 한 개
        // i=1 별 두 개
        // i=2 별 세 개

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < i+1; j++) {
                bw.write("*");
            }
            bw.write("\n");
            bw.flush();
        }
    }
}
