package programmers;
import java.util.HashSet;
/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120830
제한 시간: 30분
사용 시간: 30분
문제 접근 방식:HashSet<String> set:
s1의 모든 원소를 HashSet에 추가하여 중복을 제거하고, 빠르게 검색할 수 있게 합니다.
set.contains(str):
s2의 각 원소가 set에 포함되어 있는지 확인한다
count++:
set에 포함된 공통 원소가 있을 때마다 카운트를 증가시킨다
return count:
공통 원소의 개수를 반환한다

-
*/

public class Main2025_01_24_2 {
    public int solution(String[] s1, String[] s2) {
        // HashSet을 이용해 공통 원소를 확인
        HashSet<String> set = new HashSet<>();
        for (String str : s1) {
            set.add(str); // s1의 모든 원소를 집합에 추가
        }

        int count = 0;
        for (String str : s2) {
            if (set.contains(str)) { // s2의 원소가 s1의 집합에 있는지 확인
                count++;
            }
        }
        return count;
    }

    // 테스트용 main 함수
    public static void main(String[] args) {
        Main2025_01_24_2 sol = new Main2025_01_24_2();

        // 테스트 코드
        String[] s1_1 = {"a", "b", "c"};
        String[] s2_1 = {"com", "b", "d", "p", "c"};
        System.out.println(sol.solution(s1_1, s2_1)); // 2

        String[] s1_2 = {"n", "omg"};
        String[] s2_2 = {"m", "dot"};
        System.out.println(sol.solution(s1_2, s2_2)); // 0
    }
}