package BOJ_11022;

import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		for (int i= 0; i < t; i++) {
			String str[] = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			bw.write("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b) + "\n");
		}

		bw.flush();
	}
}