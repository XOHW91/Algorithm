import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1. 아스키 코드를 써서 A-Z를 2차 배열에 담는다.
        int start = 65;
        int end = 90+1;
        int count = 0;
        int i = 0;
        char z = (char) start;
        char[][] arr = new char[8][];

        while ( start < end) { // 이게 false가 될 때까지 돈다.
            if (z == 'P' || z == 'W') {
                count = 4;
            } else {
                count = 3;
            }
            arr[i] = new char[count];
            for (int j = 0; j < count; j++) {
                arr[i][j] = z;
                z++;
                start++;
            }
            i++;
        }

        // 2. 만약 입력 예시 문자열이 WA일 경우 하나하나 검사를 해줘야 함.
        //      ==> W가 이차 배열 중 어느 곳에 해당하는지? [i][j]이라면 i의 값을 구한다. i+3하면 됨.
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] split = input.split("\\s*");
        int sum = 0;
        for (String s : split) {
            if (!s.equals("")) { // 빈 문자열은 비교하지 않도록 함
                for (int q = 0; q < arr.length; q++) {
                    int length = arr[q].length;
                    for (int w = 0; w < length; w++){
                        String o = String.valueOf(arr[q][w]);
                        if (o.equals(s)) {
                            sum += (q+3);
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}