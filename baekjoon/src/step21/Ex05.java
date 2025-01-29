package step21;

import java.util.Scanner;

//1912 연속 합
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int sum = arr[0];

        for (int i = 1; i < N; i++) {
            sum = Math.max(sum + arr[i], arr[i]);
            max = Math.max(max, sum);
        }



        System.out.println(max);
    }
}
