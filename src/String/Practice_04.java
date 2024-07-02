package String;

import java.util.Scanner;

public class Practice_03 {
    public void run() {
        /*
        문제 )
            대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
         */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = "";
        for (int i = 0; i < s.length(); i++ ){
            char c = s.charAt(i); // String을 toCharArray를 이용하여 String배열을 생성 후 char에 넣어줘도 됨
//            if (64 < c && c < 90) { // 65와 90 사이면 대문자 97-122:소문자
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        System.out.println(result);
    }
}
