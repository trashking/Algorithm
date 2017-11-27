/*
* 문제
*   예제를 보고 별찍는 규칙을 유추한 뒤에 별을 찍어 보세요.
*
* 입력
*   첫째 줄에 N (1<=N<=100)이 주어진다.
*
* 출력
*   첫째 줄부터 2*N-1번째 줄 까지 차례대로 별을 출력한다.
*
* 예제 입력
* 3
*
* 예제 출력
*   *
*  **
* ***
*  **
*   *
 */
package BOJ_2522;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0; i < 2 * N - 1; i++) {
			int k = i;
			if (k >= N) {
			    k = (i - (i- N) * 2) - 2;
			}

			for (int space = 0; space < N - k - 1; space++) {
				System.out.print(" ");
			}
			for (int star = 0; star <= k; star++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
