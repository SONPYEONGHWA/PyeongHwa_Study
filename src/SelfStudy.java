import java.util.Scanner;

public class SelfStudy {
    public static void main(String[] args) {
         /*숙제 4. 아래와 같은 수열이 존재한다.
      while 문을 사용해서 풀어보자 ~

      1 1 3 4 5 8 12 17 25 37 ...

      키보드 입력을 받아 몇 번째 항 까지
      합치기(sigma) 를 수행할지 정한다.

      합치기 결과를 출력하시오.
     */
         int [] series;
        Scanner in = new Scanner(System.in);
        System.out.println("몇 번째 항까지 합칠까요?");
        int num = in.nextInt();

        series = new int [num];

        series[0] = 1;
        series[1] = 1;
        series[2] = 3;

        for (int i = 3; i<num; i++ ) {
            series[i] = series[i-3] + series[i-1];
        }
        for (int i =0; i<num; i++) {
            System.out.println("series["+i+"] = "+series[i]);
        }
       int res = 0;
        for (int i=0; i<num; i++){
            res += series[i];
            System.out.println("RES = "+res);
        }


    }
}
