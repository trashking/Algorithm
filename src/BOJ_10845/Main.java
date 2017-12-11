/*
 * 문제
 * 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 *
 * 명령은 총 여섯 가지이다.
 *
 * push X: 정수 X를 큐에 넣는 연산이다.
 * pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 큐에 들어있는 정수의 개수를 출력한다.
 * empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
 * front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * 입력
 * 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 *
 * 출력
 * 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 *
 * 예제 입력
 * 15
 * push 1
 * push 2
 * front
 * back
 * size
 * empty
 * pop
 * pop
 * pop
 * size
 * empty
 * pop
 * push 3
 * empty
 * front
 *
 * 예제 출력
 * 1
 * 2
 * 2
 * 0
 * 1
 * 2
 * -1
 * 0
 * 1
 * -1
 * 0
 * 3
 * TODO: stack(10828)을 이용할 생각은 했으나 queue의 메소드를 몰라서 헤맴, 틀렸다고 나옴 집에 가서 해야지.
 *
 * http://ksh-code.tistory.com/84
 * http://zoonvivor.tistory.com/6
 * 오늘 2번째 어뷰징. 핑계를 대자면 간만에 세미나와 외부에서 보낸 시간때문인데 어쨌든 아무것도 안 했으면서 1커밋 때문에 한다..
 */

package BOJ_10845;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<Integer>();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String str1[] = br.readLine().split(" ");
            String temp = str1[0];
            if (temp.equals("push")) {
                int number = Integer.parseInt(str1[1]);
                queue.offer(number);
            } else if (temp.equals("pop")) {
                if (!isEmpty(queue, bw)) {
                    bw.write(queue.poll() + "\n");
                }
            } else if (temp.equals("size")) {
                bw.write(queue.size() + "\n");
            } else if (temp.equals("empty")) {
                bw.write((queue.isEmpty() ? 1 : 0) + "\n");
            } else if (temp.equals("back")) {
                if (!isEmpty(queue, bw)) {
                    Iterator<Integer> it = queue.iterator();
                    int tempInteger = 0;
                    while (it.hasNext()) tempInteger = it.next();
                    bw.write(tempInteger + "\n");
                }
            } else if (temp.equals("front")) {
                if (!isEmpty(queue, bw)) {
                    bw.write(queue.peek() + "\n");
                }
            }
        }

        bw.flush();
    }

    private static boolean isEmpty(Queue<Integer> queue, BufferedWriter bw) throws IOException {
        if (queue.isEmpty()) {
            bw.write("-1\n");
        }

        return queue.isEmpty();
    }
}
