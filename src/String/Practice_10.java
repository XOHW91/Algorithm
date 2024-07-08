package String;

import java.util.Scanner;

public class Practice_10 {
    public void run() {
        /*
            한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

            teachermode e => 1 0 1 2 1 0 1 2 2 1 0

         */
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // teachermode
        String s = sc.next(); // e

        int[] answer = new int[str.length()];
        int a = 1000;
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(s)) { // e랑 같지 않으면
                a++;
                answer[i] = a;
            } else {
                a = 0;
                answer[i] = a;
            }
        }

        a = 1000;

        for (int i = arr.length-1; i >= 0; i--) { // 문자 길이부터 0이 될 때까지 줄어든다.
            if (!arr[i].equals(s)) {
                a++;
                answer[i] = answer[i] < a ? answer[i] : a;
//                Math.min(answer[i], a); 두 개의 값 중에 작은 값을 추출하는 함수
            } else {
                a = 0;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }

    }
}
