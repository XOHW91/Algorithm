import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 바구니 개수
        int N = sc.nextInt();
        // 공을 바꾸는 횟수
        int M = sc.nextInt();
        //i번 바구니 j번 바구니 안에 들어있는 공을 교환한다.
        int i;
        int j;
        // 바구니에 해당 바구니 번호에 맞는 숫자를 넣어줌.
        int[] arr = new int[N];
        for (int z = 0; z < N; z++) {
            arr[z] = z+1;
        }
        // 번호 바꾸기
        for (int z = 0; z < M; z++) {
            i = sc.nextInt()-1;
            j = sc.nextInt()-1;
            int a = arr[i];
            int b = arr[j];
            arr[i] = b;
            arr[j] = a;
        }

        for (int i1 : arr) {
            System.out.print(i1 + " ");
        }

    }
}
