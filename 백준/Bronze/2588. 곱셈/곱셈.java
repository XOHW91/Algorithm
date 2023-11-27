import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int a = A*(B%10);
        int b = A*((B%100)/10);
        int c = A*(B/100);

        System.out.println(a); // 472 * (385/10의 나머지 5 )
        System.out.println(b); // 472 * (85 / 10) = 472 * 8
        System.out.println(c);
        System.out.println(a + (b*10) + (c*100));
    }
}