/*
* 문제
* 예제를 보고 별찍는 규칙을 유추한 뒤에 별을 찍어 보세요.
*
* 입력
* 첫째 줄에 N (1<=N<=100)이 주어진다.
*
* 출력
* 첫째 줄부터 N번째 줄 까지 차례대로 별을 출력한다.
*
* 예제 입력
* 1
* 예제 출력
* *
* 예제 입력 2
*
* 2
* 예제 출력 2
*  *
* ***
*
* 예제 입력 3
* 3
* 예제 출력 3
*   *
*  * *
* *****
* 예제 입력 4
*
* 4
* 예제 출력 4
*    *
*   * *
*  *   *
* *******
 */

package BOJ_10992;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int numberOfLines = new Scanner(System.in).nextInt();

		if (numberOfLines > 1) {
			for (int space = 1; space < numberOfLines; space++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

		for (int line = numberOfLines - 2, count = 1; line > 0; line--, count++) {
			for (int space = line; space > 0; space--) {
				System.out.print(" ");
			}
			System.out.print("*");

			for (int space = 0; space < 2 * count - 1; space++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

		for (int star = 2 * numberOfLines - 1; star > 0; star--) {
			System.out.print("*");
		}

	}
}
