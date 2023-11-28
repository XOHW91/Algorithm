import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
 
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        if ( 1 <= A &&  C <= Math.pow(10, 12)) {
            System.out.println((long)A + (long)B + C);
        }

    }
}    