package String;

import java.util.Scanner;

public class Practice_12_1 {
    /*
        문제 )
            현수는 영희에게 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용해 보냅니다.
            비밀편지는 현수와 영희가 서로 약속한 암호로 구성되어 있습니다.

            비밀편지는 알파벳 한 문자마다 # 또는 *이 일곱 개로 구성되어 있습니다.
            만약 현수가 “#*****#”으로 구성된 문자를 보냈다면 영희는 현수와 약속한 규칙대로 다음과 같이 해석합니다.
            1. “#*****#”를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로, *이진수의 0으로 변환합니다. 결과는 “1000001”로 변환됩니다.
            2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.
            3. 아스키 번호가 65문자로 변환합니다. 즉 아스크번호 65는 대문자 'A'입니다.
            참고로 대문자들의 아스키 번호는 'A'는 65번, ‘B'는 66번, ’C'는 67번 등 차례대로 1씩 증가하여 ‘Z'는 90번입니다.
            현수가 4개의 문자를 다음과 같이 신호로 보냈다면
            #****###**#####**#####**##**
            이 신호를 4개의 문자신호로 구분하면
            #****## --> 'C'
            #**#### --> 'O'
            #**#### --> 'O'
            #**##** --> 'L'
            최종적으로 “COOL"로 해석됩니다.

            첫 줄에는 보낸 문자의 개수(10을 넘지 안습니다)가 입력된다. 다음 줄에는 문자의 개수의 일곱 배 만큼의 #또는 * 신호가 입력됩니다.
            현수는 항상 대문자로 해석할 수 있는 신호를 보낸다고 가정합니다.
            4
            #****###**#####**#####**##**
            #****## #**#### #**#### #**##**
            ==> COOL
     */
        public void run() {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            String str = sc.next();
            // replace를 이용해서 #은 1 , *은 0으로 변환한다.
            str = str.replace('#', '1').replace('*', '0');

            // 문자를 7개씩 잘라서 배열에 담는다.
            String[] s = new String[t];
            int start = 0, end = 7;
            for (int i = 0; i < str.length(); i += 7) {
//                String substring = str.substring(i, Math.min(i + 7, str.length()));
                String substring = str.substring(start, end);
                // substring(begin, end) 는 begin번째 인덱스부터 end 직전의 인덱스까지 자르겠다는 뜻으로 end번 째는 제외함.
                // i를 활용해서 알고리즘을 잘 찾아봐야 함.
                // Math.min은 문자열의 길이를 넘지 않도록 하는 것.
                // 물론 start, end를 사용한 방법도 가능함.
                s[i/7] = substring;
                start = end;
                end += 7;
            }

            // 자른 문자들을 10진수로 변환한다.
//            double[] result = new double[t];
//            for (int i = 0; i < s.length; i++) {
//                int count = 6; // 인덱스 번호 유의해야함. 0부터 시작하기에 마지막 지수는 6임.
//                for (int j = 0; j < s[i].length(); j++) {
//                    int b =  Integer.parseInt(String.valueOf(s[i].charAt(j)));
//                    result[i] += (Math.pow(2, count) * b); //
//                    count--;
//                }
//            }

            for (int i = 0; i < s.length; i++) {
                System.out.print((char) Integer.parseInt(s[i], 2));
            }

//            // 변환한 문자들을 char에 담아 출력
//            for (double b : result) {
//                char c = (char) b;
//                System.out.print(c);
//            }

        }
}
