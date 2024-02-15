
package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class question28 {
    /**
     *백준 12891번
     * DNA비밀번호 (어렵다;;)
     * 슬라이딩윈도우, 동적계획법(다이나믹 프로그래밍)
     */

    static int[] myArr;
    static int[] arr;
    static int checkSecret;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int result = 0;

        arr = new int[4];
        myArr = new int[4];
        char[] resultArr = new char[S];
        checkSecret = 0;

        resultArr = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] == 0){
                checkSecret++;
            }
        }

        for(int i = 0; i < P; i++){//부분문자열 처음 받을때 세팅
            Add(resultArr[i]);
        }

        if(checkSecret == 4){
            result++;
        }

        for(int i = P; i < S; i++){
            int j = i - P;
            Add(resultArr[i]);
            Remove(resultArr[j]);
        }

        System.out.println(result);
        br.close();
    }

    private static void Remove(char c) {
        switch (c){
            case 'A':
                if(myArr[0] == arr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == arr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == arr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == arr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch (c){
            case 'A':
                myArr[0]++;
                if(myArr[0] == arr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == arr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == arr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == arr[3]) checkSecret++;
                break;
        }
    }
}
