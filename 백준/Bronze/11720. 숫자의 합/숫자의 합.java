import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        String[] split = str.split("");
        int sum = 0;
        for (String s : split) {
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}