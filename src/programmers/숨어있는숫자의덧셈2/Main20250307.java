package programmers.숨어있는숫자의덧셈2;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120848
제한 시간: 30분
사용 시간: 5분
문제해결방법:
1.정규 표현식을 사용하여 숫자를 추출
2.배열을 순회하면서 숫자로 변환 후 합산

*/
public class Main20250307 {
    public static int solution(String my_string) {
        int sum = 0;
        String[] numbers = my_string.split("[^0-9]+");

        for (String num : numbers) {
            if (!num.isEmpty()) {
                sum += Integer.parseInt(num);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123Z"));
    }
}

            












