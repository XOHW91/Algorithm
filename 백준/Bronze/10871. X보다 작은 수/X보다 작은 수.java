import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        String arr = sc.nextLine();
        String[] array = sc.nextLine().split(" ");

        for (String s : array) {
            int Y = Integer.parseInt(s);
            // 배열의 값인 Y가 X보다 작으면
            if (Y < X) {
                System.out.print(Y + " ");
            }
        }

    }
}
