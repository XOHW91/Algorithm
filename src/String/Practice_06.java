package String;

import java.util.Scanner;

public class Practice_06 {
    public void run() {
        /*
        문제 )
            소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
            중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
            ksekkset ==> kset
         */

        Scanner sc = new Scanner(System.in);
//        String[] str = sc.next().split("");
//
//        String result = str[0]; // k가 들어있음.
//
//        for (int i = 0; i < str.length; i++) {
//            if (!result.contains(str[i])) { // result에 str[i]가 포함 안되있으면
//                result += str[i];
//            }
//        }
//        System.out.println(result);
        String str = sc.next();
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                /*
                    indexOf(m) ==> m이라는 글자가 문자열의 몇번째 인덱스인지 알려줌.
                    즉, indexOf() 와 i가 일치하지 않으면 처음나온 문자열이 아니라는 뜻
                */
                answer += str.charAt(i);

            }
        }
        System.out.println(answer);
    }
}
