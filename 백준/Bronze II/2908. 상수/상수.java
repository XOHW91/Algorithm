import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        final String[] split = s.split("");

        int start = 0; //  0번 배열
        int end = split.length-1; // 6번 배열
        int order = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(" ")) { // 공백이 나오면 for문 종료
                order = i;
                break;
            } else { // 공백이 아니라면.
                String temp = split[start]; // 맨 처음 배열 값
                split[start] = split[end];
                split[end] = temp;
                start++; // 0, 1, 2
                end--; // 6, 5, 4
            }
        }
        // split이라는 배열에는 공백 기준으로 순서가 뒤바뀌어서 들어가 있음.
        String a = "";
        String b = "";
        for (int i = 0; i < split.length; i++) {
            if (i < order) { // order=3
                a += split[i];
            } else {
                if (!split[i].equals(" ")){
                    b += split[i];
                }
            }
        }
        System.out.println( Integer.parseInt(a) > Integer.parseInt(b) ? Integer.parseInt(a) : Integer.parseInt(b));
    }
}