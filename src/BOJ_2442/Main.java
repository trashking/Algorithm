/*
* 문제
* 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2*N-1개를 찍는 문제
*
* 별은 가운데를 기준으로 대칭이어야 한다.
*
* 입력
* 첫째 줄에 N (1<=N<=100)이 주어진다.
*
* 출력
* 첫째 줄부터 N번째 줄 까지 차례대로 별을 출력한다.
*
* 예제 입력
* 5
*
* 예제 출력
*     *
*    ***
*   *****
*  *******
* *********
 */

package BOJ_2442;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		for (int N = sc.nextInt(), i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
