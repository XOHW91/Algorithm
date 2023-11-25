import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (0 < A && B < 10) {
            System.out.println(A+B);
        } else {
            System.out.println("0 < A && B < 10 이어야 합니다.");
        }

    }
}

