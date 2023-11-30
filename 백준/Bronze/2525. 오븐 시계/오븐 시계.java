import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int time = sc.nextInt();

        int HOfTime = time/60;
        int MOfTime = time%60;
        
        int HOfResult = 0;
        int MOfResult = 0;

        if ((M + MOfTime) >= 60) {
            HOfResult = (M + MOfTime) / 60;
            MOfResult = (M + MOfTime) % 60;
            HOfResult += (H + HOfTime);
        } else {
            HOfResult = (H + HOfTime);
            MOfResult = (M + MOfTime);
        }

        if (HOfResult >= 24) {
            HOfResult-=24;
        }
        
        System.out.println(HOfResult + " " + MOfResult);
        
    }
}