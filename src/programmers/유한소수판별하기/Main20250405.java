package programmers.유한소수판별하기;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120878
제한 시간: 30분
사용 시간: 18분
문제해결방법
생성자로 분자와 분모를 받아 저장
checkFiniteDecimal() 메서드에서 유한소수 여부를 판단
최대공약수 구하는 유틸리티 메서드

*/
public class Main20250405 {
    private int numerator;
    private int denominator;

    public Main20250405(int a, int b) {
        this.numerator = a;
        this.denominator = b;
    }

    public int checkFiniteDecimal() {
        int gcd = getGCD(numerator, denominator);
        int reducedDenominator = denominator / gcd;

        while (reducedDenominator % 2 == 0) {
            reducedDenominator /= 2;
        }

        while (reducedDenominator % 5 == 0) {
            reducedDenominator /= 5;
        }

        return (reducedDenominator == 1) ? 1 : 2;
    }


    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // 테스트용
    public static void main(String[] args) {
        Main20250405 s1 = new Main20250405(7, 20);
        System.out.println(s1.checkFiniteDecimal());

        Main20250405 s2 = new Main20250405(11, 22);
        System.out.println(s2.checkFiniteDecimal());

        Main20250405 s3 = new Main20250405(12, 21);
        System.out.println(s3.checkFiniteDecimal());
    }
}












