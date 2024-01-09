import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[28];
        for (int i = 0; i < arr.length; i++) {
            // 28개의 숫자를 입력받아서 배열에 담음.
            arr[i] = sc.next();
        }

        int[] result = new int[2];
        int count = 0;
        // arr을 for문 돌리면서 1-30까지의 숫자 중에 일치하지 않는 i값을 찾아서 result배열에 넣음
        for (int i = 1; i < arr.length+3; i++) { // i = 1~30
            // arr 안에 i라는 숫자가 있는지 확인 ==> 없으면 i를 result에 저장
            if (!Arrays.asList(arr).contains(String.valueOf(i))) {
                result[count] = i;
                count++;
            }
        }

        int min = result[0];
        for (int i = 0; i < result.length; i++) {
            if (result[i] < min) {
                min = result[0];
            }
        }
        System.out.println(min);
        for (int i = 0; i < result.length; i++) {
            if (result[i] == min) {
                continue;
            }
            System.out.println(result[i]);
        }
    }

}