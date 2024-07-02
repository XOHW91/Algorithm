package String;

import java.util.Scanner;

public class Practice_01 {
    public void run() {
        /*
        문제 )
            한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
            대소문자를 구분하지 않습니다. 문자열의 길이는 100을 넘지 않습니다.
         */
        Scanner sc = new Scanner(System.in);

        // 입력받은 문자열
        String[] s = sc.next().split("");

        // 입력받은 문자
        String word = sc.next();

        // 카운트 변수
        int count = 0;

        for (int i = 0; i < s.length; i++) {
            if(s[i].equalsIgnoreCase(word)) {
                count++;
            }
        }

        System.out.println("count : " + count);


        // 이외에도 대소문자 구분을 하지 않기 때문에 모든 문자를 소문자 혹은 대문자로 바꾸어서 세어줘도 됨.  ==> toUpperCase / toLowerCase 사용

    }
}
