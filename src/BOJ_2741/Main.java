package BOJ_2741;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		//for (int i = 1; i <= n; i++) {
		//	System.out.println(i);
		//}
		// 알고리즘 입/출력에서 나온 stringbuilder 로 변경해봄
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= n; i++) {
			sb.append(i + "\n");
		}

		System.out.print(sb);
	}
}
