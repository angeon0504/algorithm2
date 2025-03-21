package programmers.삼각형의완성조건2;

import java.util.Arrays;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120868
제한 시간: 30분
사용 시간: 30분
문제해결방법:
// 두 변을 정렬 (short, long)

  // (1) 가장 긴 변이 longSide인 경우: 가능한 x는 (longSide - shortSide + 1) ~ longSide
  // (2) 나머지 한 변이 가장 긴 변인 경우: 가능한 x는 (longSide + 1) ~ (shortSide + longSide - 1)
*/
public class Main20250321 {
    public int solution(int[] sides) {
        Arrays.sort(sides); // 두 변 정렬
        int shortSide = sides[0];
        int longSide = sides[1];


        int count1 = longSide - (longSide - shortSide + 1) + 1;


        int count2 = (shortSide + longSide - 1) - (longSide + 1) + 1;

        return count1 + count2;
    }


    // 테스트 코드
    public static void main(String[] args) {
        Main20250321 solution = new Main20250321();
        System.out.println(solution.solution(new int[]{1, 2}));
        System.out.println(solution.solution(new int[]{3, 6}));
        System.out.println(solution.solution(new int[]{11, 7}));
    }
}












