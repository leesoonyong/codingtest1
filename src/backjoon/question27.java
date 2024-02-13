
package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class question27 {
    /**
     *백준 2096번
     * 슬라이딩윈도우, 동적계획법(다이나믹 프로그래밍)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] maxDp = new int[N];
        int[] minDp = new int[N];

        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int x3 = Integer.parseInt(st.nextToken());

            if(i == 0){
                maxDp[0] = minDp[0] = x1;
                maxDp[1] = minDp[1] = x2;
                maxDp[2] = minDp[2] = x3;
            }else{
                int firMaxDp0 = maxDp[0], firMaxDp2 = maxDp[2];
                //최댓값구하기
                //위에수와 아래의 수 중에 큰값을 비교하고 처음수인 위에수를더한다
                maxDp[0] = Math.max(maxDp[0], maxDp[1]) + x1;
                maxDp[2] = Math.max(maxDp[1], maxDp[2]) + x3;
                maxDp[1] = Math.max(firMaxDp0,Math.max(maxDp[1],firMaxDp2)) + x2;

                //최소값구하기
                int firMin = minDp[0], beforeMinDp_2 = minDp[2];
                minDp[0] = Math.min(minDp[0], minDp[1]) + x1;
                minDp[2] = Math.min(minDp[1], minDp[2]) + x3;
                minDp[1] = Math.min(firMaxDp0,Math.min(minDp[1],firMaxDp2)) + x2;
            }

        }
        int maxNumber = Math.max(maxDp[0],Math.max(maxDp[1],maxDp[2]));
        int minNumber = Math.min(minDp[0],Math.min(minDp[1],minDp[2]));
        System.out.println(maxNumber + " " + minNumber);
    }
}
