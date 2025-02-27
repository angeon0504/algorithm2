package programmers.합성수찾기;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120904
제한 시간: 30분
사용 시간: 15분 초
문제 접근 방식1부터 n까지 순회하면서 getDivisorCount(i)를 이용해 약수의 개수를 구함.
약수의 개수가 3개 이상이면 합성수이므로 count++ 증가.
모든 수를 검사한 후, 최종 합성수 개수를 반환.

*/
public class Main20250227 {
    public int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (countDivisors(i) >= 3) {
                count++;
            }
        }
        return count;
    }


    private int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                if (i != num / i) count++;
            }
        }
        return count;
    }

    // 메인 실행 코드
    public static void main(String[] args) {
        Main20250227 solution = new Main20250227();
        System.out.println(solution.solution(10));
        System.out.println(solution.solution(15));
    }
}










