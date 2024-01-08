import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) { 
        Scanner sc = new Scanner(System.in);
        int N = 9;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex+1);
    }
}
