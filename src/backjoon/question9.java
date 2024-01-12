package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class question9 {

    /*백준 2010번
    암호화 방식 중에는 소수를 이용하는 것들이 많다. 보통은 매우 큰 두 개의 소수를 선택하고, 두 소수를 곱한 값을 암호화에서의 키로 사용하고는 한다. 이러한 방법이 좋은 이유는 일반적으로 매우 큰 수를 소인수분해 하는 것이 어렵기 때문이다.

    소수를 택할 때 큰 수를 택하면, 이 둘을 곱해서 얻어지는 키 값도 커지게 된다. 하지만 그 반대는 성립하지 않을 수도 있다. 즉, 키 값이 매우 큰 경우에도 이를 소인수분해 하는 것은 쉬울 수도 있다.

    따라서 암호문이 크랙되지 않도록 하기 위해서는, 키 값이 적절히 큰 수들의 곱으로 이루어져 있는지를 확인해야 할 필요가 있다. 키 값 K와 정수 L이 주어졌을 때, K를 인수분해 했을 때, 항상 L 이상의 값으로만 이루어져 있는지를 확인하고 싶다. 물론 인수분해 할 때 1로 나누는 경우는 고려하지 않는다.

    예를 들어 K=143인 경우, 이는 11과 13의 곱으로 이루어져 있다. 즉, 이를 인수분해 하는 방법은 11×13, 143의 두 가지 경우뿐이다. 따라서 L이 11일 경우에는 인수분해 했을 때 나온 수들이 모두 L 이상이므로 좋은 경우지만, L이 12이상일 경우에는 좋은 암호가 아니다.

    K와 L이 주어졌을 때, 좋은 암호인지 판단하는 프로그램을 작성하시오.
    */

    //최소 소인수만 구하면 이 문제는 끝남 최소 소인수가 L보다 작으면 BAD이기때문

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] numbers = br.readLine().split(" ");

        int K = Integer.parseInt(numbers[0]);
        int L = Integer.parseInt(numbers[1]);

        int smallestFactor = findSmallestFactor(K);

        if(smallestFactor >= L){
            System.out.println("GOOD");
        }else{
            System.out.println("BAD");
            System.out.println(smallestFactor);
        }
        br.close();
    }

    public static int findSmallestFactor(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
               return i;
            }
        }
        return -1;
    }
}
