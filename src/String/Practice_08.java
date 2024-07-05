package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice_08 {
    public void run() {
        /*
        문제 )
            앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
            문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
            단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.

            found7, time: study; Yduts; emit, 7Dnuof
            ==> YES
         */

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().replaceAll("[^a-zA-Z]", "");
        String reverse = str.replaceAll("[^a-zA-Z]", "");
        String result = "YES";
        if (!str.equalsIgnoreCase(reverse)) {
            result = "NO";
        }
        System.out.println(result);

        /*
            1. 정규표현식 > ^ : 부정 / a-z : 소문자 / A-Z : 대문자
            2. replace는 정규표현식 적용이 안됨. replaceAll을 써야 함.
            3. 나는 주어진 문장을 문자열로 잘라서 쓰려고 했는데 생각해보니 특수기호 빼면
               알파벳만 추려서 거꾸로 반전시킨 문자열이랑 같음. 즉, 나눌 필요 없이 문장 전체로 로직을 짜도 됐었던 것.
            4. equlasIgnoreCase는 소문자, 대문자 할 것 없이 같은 문자열인지 검사하는 메서드.
         */

    }
}
