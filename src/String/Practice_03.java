package String;

import java.util.Scanner;

public class Practice_03 {
    public void run() {
        /*
        문제 )
            한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
            문장속의 각 단어는 공백으로 구분됩니다.
            it is time to study ==> study
         */
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" "); // 공백을 기준으로 잘라서 배열에 넣음
        String result = "";

        for (int i = 0; i < str.length; i++) {
            result = result.length() > str[i].length() ? result : str[i]; // 삼항 연산자를 사용하여 문자열이 가장 긴 값만을 저장하여 출력
        }

        System.out.println(result);

    }
}
