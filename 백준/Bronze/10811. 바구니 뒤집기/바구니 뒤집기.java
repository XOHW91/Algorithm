import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        // 바구니 배열 초기화
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        // M번 순서를 역순으로 만듦
        for (int m = 0; m < M; m++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;

            // 범위의 중간을 기준으로 역순으로 바꿈
            while (start < end) {
                int temp = baskets[start];
                baskets[start] = baskets[end];
                baskets[end] = temp;

                start++;
                end--;
            }
        }

        // 결과 출력
        for (int i : baskets) {
            System.out.print(i + " ");
        }
    }
}