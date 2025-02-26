package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//최대 최소 합
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<5; i++){
            arr.add(sc.nextInt());
        }

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        System.out.println(min+" "+max);
        for(int i=0;i<5;i++){
            long result=0;
            for(int j=0;j<5;j++){
                if(i!=j){
                    result += arr.get(j);
                }
            }
            if(result>max){
                max=result;
            }
            if(result<min) {
                min = result;
            }
        }

        System.out.println(max+" "+min);
    }
}
