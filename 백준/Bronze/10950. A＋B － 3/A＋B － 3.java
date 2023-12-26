import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A+B);
        }
    }
}
