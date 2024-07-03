package String;

import java.util.Scanner;

public class Practice_04 {
    public void run() {
        /*
        문제 )
            N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
            첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
            두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = new String[N]; // 입력받은 숫자 크기 만큼의 배열을 만듬.

        for (int i = 0; i < N; i++) {
            str[i] = sc.next(); // N개의 단어를 입력받아서 배열에 넣음.
        }

        for (int i = 0; i < str.length; i++) {
            // StringBuilder 클래스를 사용한 방법
            String reversed = new StringBuilder(str[i]).reverse().toString(); // 단어를 뒤집음
            System.out.println(reversed); // 뒤집힌 단어를 출력

            // 배열과 문자열의 길이로 순서를 이용한 방법
//            char[] chars = str[i].toCharArray(); // 각 단어를 문자 배열로 변환
//            int left = 0;
//            int right = chars.length - 1;
//
//            // 앞뒤를 바꾸는 로직
//            while (left < right) {
//                char temp = chars[left];
//                chars[left] = chars[right];
//                chars[right] = temp;
//                left++; // 0 1 2
//                right--; // 5 4 3
//            }
//            // 문자 배열을 다시 문자열로 변환하여 출력
//            System.out.println(new String(chars));
        }
    }
}
