import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        // long = 4를 의미
        
        String sum = "";
        
        for(int i = 0; i < (A/4); i++) {
            sum += "long ";
        }
        System.out.println(sum + "int");
    }
}
