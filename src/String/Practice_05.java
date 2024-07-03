package String;

import java.util.Scanner;

public class Practice_05 {
    public void run() {
        /*
        문제 )
            영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
            특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

            a#b!GE*T@S ==> S#T!EG*b@a

         */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();

        int start = 0;
        int end = c.length-1;

        while (start < end) {
            if (!Character.isAlphabetic(c[start])) {
                start++;
                continue;
            }
            if (!Character.isAlphabetic(c[end])) {
                end--;
                continue;
            }
            /*
                첫번째는 c[start]와 c[end]가 모두 알파벳이기 때문에
                    ==> if 문을 그대로 통과함. start = 0 / end = 10
                아래에서 값을 바꿔주고 두번째 바퀴로 감. start = 1 / end = 9
                두번째는 start = 1인 상태이므로 if문에 걸림 == > start = 2가 되고 다음 바퀴로 넘어감
                세번째는 start = 2이며 알파벳이기 때문에 통과, 하지만 end = 9에서 특수문자라서 end-- ==> end=8
                네번 째는 start = 2 은 통과 / end = 8은 알파벳이라 b와 T를 교환하고 인덱스 조정함.
                이런 식으로 특정 문자의 순서만을 바꿀 수 있음.

                정리해보자면, 앞 인덱스와 뒷 인덱스를 알파벳인 경우에만 조정을 해주어서 알파벳일 때만 만날 수 있도록 함.
            */

            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;

            // 인덱스 조정
            start++;
            end--;
        }

        System.out.println(new String(c));

    }
}
