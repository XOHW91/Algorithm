import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10개의 수를 입력받아 42로 나눈 나머지를 배열에 담는다.
        Integer[] arr = new Integer[10];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int reminder = sc.nextInt() % 42;
            if (!Arrays.asList(arr).contains(reminder)) {
                arr[i] = reminder;
                count++;
            }
        }
        
        System.out.println(count);
    }
}
