import java.beans.PropertyEditorSupport;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // 문자열 양 끝의 공백 제거 후 공백을 기준으로 나눔
        String[] words = input.trim().split(" ");
//        split(" ") 메서드는 주어진 문자열을 공백으로 나눌 때, 연속된 공백도 분리하여 빈 문자열을 생성한다.
//        즉, split을 공백으로 나누면은 문장의 첫 글자가 공백일 경우 "" 가 들어가게 됨.

        words = removeEmptyStrings(words);
        System.out.println(words.length);

    }

    private static String[] removeEmptyStrings(String[] words) {
        int count = 0;
        // 공백이 아닌 배열 값의 개수를 센다.
        for (String s : words) {
            if (!s.isEmpty()) {
                count++;
            }
        }

        // 공백이 아닌 개수만큼의 크기의 배열을 만든다.
        String[] result = new String[count];
        int index = 0;
        for (String s : words) {
            if (!s.isEmpty()) { // 공백이 아닐 때 result에 s를 더함. 
                result[index++] = s;
            }
        }

        return result;
    }
}