import String.Practice_12_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        Practice_12_1 practice = new Practice_12_1();
//        practice.run();
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int result = 0;
        for (String s : str) {
            result += Integer.parseInt(s);
        }
        System.out.println(result);
    }
}