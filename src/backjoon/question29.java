
package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class question29 {
    /**
     *백준 1897
     * 스택문제
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        int start = 0;

        while(N-- > 0){
            //수열값일단 수열까지넣자
            int value = Integer.parseInt(br.readLine());
            if(value > start){
                // start + 1부터 입력받은 value 까지 push를 한다.
                for(int i = start+1; i<= value; i++){
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                start = value; //다음 push할 때의 오름차순을 유지하기 위한 변수 초기화
            }
            else if(stack.peek() != value){
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');

        }
        System.out.println(sb);

    }
}
