package programmers.저주의숫자3;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120871
제한 시간: 30분
사용 시간: 18분
문제해결방법
result는 실제 숫자를 하나씩 증가시켜가며 검사
result가 3의 배수가 아니고, '3'이 포함되지 않으면, 유효한 수로 판단하여 count++
원하는 n번째 수가 될 때까지 루프를 돌리기

*/
public class Main20250405 {
    public int solution(int n) {
        int count = 0;
        int result = 0;

        while (count < n) {
            result++;
            if (result % 3 != 0 && !String.valueOf(result).contains("3")) {
                count++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main20250405 solution = new Main20250405();

        System.out.println(solution.solution(15));
        System.out.println(solution.solution(40));
    }
}













