import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int big = 0;

        if( A==B && A==C && B==C) {
            System.out.println(10000 + (1000*A));
        } else if ( A==B || A==C || B==C) {
            if (B==C) {
                System.out.println(1000 + (B*100));
            } else {
                System.out.println(1000 + (A*100));
            }
        } else {
            if(A > B && A > C) {
                big = A;
            } else if (B > A && B > C) {
                big = B;
            } else if (C > A && C > B) {
                big = C;
            }
            System.out.println(big*100);
        }

    }
}