import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 1;
        while(sc.hasNextLine() && count < 101) {
            String s = sc.nextLine();
            if (s.isEmpty()) {
                break;
            }
            System.out.println(s);
            count++;
        }
    }
}