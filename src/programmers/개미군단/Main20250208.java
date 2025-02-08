package programmers.개미군단;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120837
제한 시간: 30분
사용 시간: 7분 초
문제 접근 방식: 1.generalAnt = hp / 5: 장군개미로 최대한 많은 체력을 처리
2.hp %= 5: 남은 체력을 갱신
3.soldierAnt = hp / 3: 병정개미로 최대한 많은 체력을 처리
4.hp %= 3: 남은 체력을 다시 갱신합니다.
5.workerAnt = hp: 남은 체력을 일개미로 처리
6.세 개의 개미 수를 더하여 최소 병력 값을 반환

*/
public class Main20250208 {
    public static int solution(int hp) {
        int generalAnt = hp / 5;  // 장군개미
        hp %= 5;

        int soldierAnt = hp / 3;  // 병정개미
        hp %= 3;

        int workerAnt = hp;      // 일개미

        return generalAnt + soldierAnt + workerAnt;
    }

    public static void main(String[] args) {
        // 테스트 코드
        System.out.println(solution(23));  // 5
        System.out.println(solution(24));  // 6
        System.out.println(solution(999)); // 201
    }
}

