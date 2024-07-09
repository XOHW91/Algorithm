import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int result = 0;
        long A = Long.parseLong(str[0]);
        long B = Long.parseLong(str[1]);
        long C = Long.parseLong(str[2]);
        System.out.println(A+B+C);
    }
}