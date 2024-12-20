import java.util.*;

public class 알고리즘7 {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 두 분모의 최소공배수를 구합니다.
        int lcmDenom = lcm(denom1, denom2);

        // 두 분자의 값을 공통 분모 기준으로 변환합니다.
        int newNumer1 = numer1 * (lcmDenom / denom1);
        int newNumer2 = numer2 * (lcmDenom / denom2);

        // 두 분자를 더합니다.
        int resultNumer = newNumer1 + newNumer2;

        // 결과 분자와 분모의 최대공약수를 구합니다.
        int gcdResult = gcd(resultNumer, lcmDenom);

        // 기약 분수로 변환하여 결과를 반환합니다.
        return new int[]{resultNumer / gcdResult, lcmDenom / gcdResult};
    }

    // 유클리드 호제법을 이용한 최대공약수 계산
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // 최소공배수 계산
    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(1, 2, 3, 4))); // [5, 4]
        System.out.println(Arrays.toString(solution(9, 2, 1, 3))); // [29, 6]
    }
}


