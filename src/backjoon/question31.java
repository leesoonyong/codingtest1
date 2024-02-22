
package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class question31 {
    /**
     *백준 11286
     * 스택문제
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<>();

        while(N-- > 0){
            st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            if(count == 1){
                stack.add(Integer.parseInt(st.nextToken()));
            }else if(count == 4){
                if(stack.isEmpty()){
                    sb.append("1").append("\n");
                }else{
                    sb.append("0").append("\n");
                }
            }else if(count == 2){
                if(stack.isEmpty()){
                    sb.append("-1").append("\n");
                }else{
                    sb.append(stack.pop()).append("\n");
                }
            }else if(count == 3){
                sb.append(stack.size()).append("\n");
            }else if(count == 5){
                if(stack.isEmpty()) {
                    sb.append("-1").append("\n");
                }else{
                    sb.append(stack.peek()).append("\n");
                }
            }
        }

        System.out.println(sb.toString());

    }
}
