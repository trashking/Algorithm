/*
* 문제
* 숫자와 콤마로만 이루어진 문자열 S가 주어진다. 이 때, S에 포함되어있는 자연수의 합을 구하는 프로그램을 작성하시오.
*
* S의 첫 문자와 마지막 문자는 항상 숫자이고, 콤마는 연속해서 주어지지 않는다. 주어지는 수는 항상 자연수이다.
*
* 입력
* 첫째 줄에 문자열 S가 주어진다. S의 길이는 최대 100이다. 포함되어있는 정수는 1,000,000보다 작거나 같은 자연수이다.
*
* 출력
* 문자열 S에 포함되어 있는 자연수의 합을 출력한다.
*
* 예제 입력
* 10,20,30,50,100
*
* 예제 출력
* 210
 */

package BOJ_10822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        StringTokenizer st = new StringTokenizer(line,",");

        int sum = 0;
        while (st.hasMoreTokens()) {
            sum += Integer.valueOf(st.nextToken());
        }

        System.out.println(sum);
    }
}
