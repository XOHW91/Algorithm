import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 단어받아서 한 글자 한 글자 잘라서 배열에 담는다.
        String S = sc.next();
        String[] split = S.split("");
        // 자른 단어의 각 알파벳마다 순서를 설정함.
        Map<String, Integer> List = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            if(List.keySet().contains(split[i])) {
                continue;
            }
            List.put(split[i], i);
        }
        // 알파벳 배열 준비
        char[] arr = new char[26];
        int count = 0;
        for (char i = 97; i < 123 ; i++) {
            arr[count] = i;
            count++;
        }

        // arr의 길이만큼 돌면서 출력
        for (int i = 0; i < arr.length; i++) {
          if (List.containsKey(String.valueOf(arr[i]))) {
              // 만약 List의 key와 일치하는 arr[i]가 있다면
              System.out.print(List.get(String.valueOf(arr[i])) + " ");
          } else { // 없으면
              System.out.print("-1 ");
          }
        }

    }
}