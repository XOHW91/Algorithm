package String;

import java.util.Scanner;

public class Practice_07 {
    public void run() {
        /*
        문제 )
            앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
            문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
            단 회문을 검사할 때 대소문자를 구분하지 않습니다.

            gooG ==> YES
         */
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

//        String reverseStr = new StringBuilder(str).reverse().toString(); // reverse()해주면 결과는 StringBuffers타입이라 toString해주는 것
//
//        if (str.equalsIgnoreCase(reverseStr)) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }

        /*
            다른 방법 : index를 이용한 직접 비교
                짝수 gooG => 0 1 2 3 ./// 03 12
                4-1-0
                4-1-1
                0 1 2 3
                홀수 stust => 0 1 2 3 4 /// 04 13
                짝수이든 홀수이든 첫번째와 끝을 차례대로 비교해주면 됨.
                즉 for문은 0부터 문자열 길이-1만큼 돌면 됨
         */
//        str = str.toUpperCase();
//        String result = "YES";
//        for (int i = 0; i < str.length()/2; i++) {
//            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
//                result = "NO";
//            }
//        }
//
//        System.out.println(result);


        // 위 방법은 배열을 만들지 않고 charAt을 통해서 문자열의 인덱스에 해당하는 알파벳을 비교하면서 로직을 짰다.
        // 아래의 방법은 입력받은 str을 다시 한 번 split하여 배열로 만들어 준 후 비교하는 것
        int start = 0;
        int end = str.length()-1;
        String result = "YES";
        String[] s = str.split("");
        while (start < end) {
            if(!s[start].equalsIgnoreCase(s[end])) {
                result = "NO";
            }
            start++;
            end--;
        }
        System.out.println(result);
    }
}
