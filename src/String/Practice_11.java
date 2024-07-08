package String;

import java.util.*;

public class Practice_11 {
    public void run() {
        /*
            알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
            문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
            단 반복횟수가 1인 경우 생략합니다.

            KKHSSSSSSSE ==> K2HS7E
         */
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        str += " ";  // i와 i+1을 비교해야해서 맨 마지막을 공백으로 만들어준다. ==> 이 때 주의해야할 점은 ""과 " "은 다름. ""은 아무런 변화가 없음.
        int count = 1; // 문자 하나가 있다고 보기 때문에 1로 초기화 해야 함.
        String answer = "";
        for (int i = 0; i < str.length()-1; i++) { // 맨 마지막 빈 문자열은 세지 않는다.
            if (str.charAt(i) == str.charAt(i+1)) count++; // 다음 문자와 같으면 count를 증가시킨다.
            else { // 다음 문자와 다를 경우에는 해당 문자를 우선 저장함. count==1일 때는 생략한다고 했으므로 조건문 작성을 해줌.
                answer += str.charAt(i);
                if (count > 1) answer += String.valueOf(count); // count는 int형이기 때문에 string으로 형변환 해줘야함.
                count = 1;
            }
        }

        System.out.println(answer);

    }
}
