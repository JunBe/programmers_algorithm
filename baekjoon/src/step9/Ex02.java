package step9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2501 약수 구하기
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                list.add(i);
            }
        }
        if (list.size() >= K) {
            System.out.println(list.get(K - 1));
        } else {
            System.out.println(0);
        }
    }
}
