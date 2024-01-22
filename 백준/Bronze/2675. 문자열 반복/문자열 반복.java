import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 개수
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) { // 2바퀴 돔
            int R = sc.nextInt();
            String P = sc.next();
            String[] PList = P.split(""); // A,B,C ==> /,H,T,P

            for (int j = 0; j < PList.length; j++) {
                for (int z = 0; z < R; z++) {
                    System.out.print(PList[j]);
                }
            }
            System.out.println();
        }
    }
}