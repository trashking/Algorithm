/*
* 문제
* 예제를 보고 별찍는 규칙을 유추한 뒤에 별을 찍어 보세요.
*
* 입력
* 첫째 줄에 N (1<=N<=100)이 주어진다.
*
* 출력
* 첫째 줄부터 2*N-1번째 줄 까지 차례대로 별을 출력한다.
*
* 예제 입력
* 5
*
* 예제 출력
* *        *
* **      **
* ***    ***
* ****  ****
* **********
* ****  ****
* ***    ***
* **      **
* *        *
*/

package BOJ_2445;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= 2 * N - 1; i++) {
            int k = i;

            if (k > N) {
                k = k - (i - N) * 2;
            }
            //System.out.println("i: " + i);
            //System.out.println("k: " + k);

            for (int frontStar = 0; frontStar < k; frontStar++) {
                //System.out.println("frontStar: " + frontStar);
                System.out.print("*");
            }
            for (int space = 0; space < 2 * N - 2 * k; space++) {
                //System.out.println("space: " + space);
                System.out.print(" ");
            }
            for (int rearStar = 0; rearStar < k; rearStar++) {
                //System.out.println("rearStar: " + rearStar);
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
