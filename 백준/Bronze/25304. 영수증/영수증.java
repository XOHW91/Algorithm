import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            sum += (A * B);
        }
        if (total == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
