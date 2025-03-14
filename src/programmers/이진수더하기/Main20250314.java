package programmers.이진수더하기;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120852
제한 시간: 30분
사용 시간: 15분
문제해결방법:
소인수 찾기
이진수 문자열을 정수(int)로 변환 (2진수 → 10진수)
두 숫자의 합을 구함
합을 다시 이진수 문자열로 변환하여 반환 (10진수 → 2진수)
n
*/
public class Main20250314 {
    public static String solution(String bin1, String bin2) {

        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);


        int sum = num1 + num2;


        return Integer.toBinaryString(sum);
    }

    public static void main(String[] args) {
        // 테스트 케이스
        System.out.println(solution("10", "11"));
        System.out.println(solution("1001", "1111"));
    }
}












