package programmers.삼각형의완성조건1;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120889
제한 시간: 30분
사용 시간: 6분 초
문제 접근 방식: 가장 큰 변을 찾고 나머지 두변의 합을 계산하는 코드를 작성 마지막으로 삼각형의 조건을 확인하는 코드를 작성해서 풀어보자

*/
public class Main20250202 {
    public int solution(int[] sides) {

        int max = sides[0];
        int sum = 0;

        for (int side : sides) {
            sum += side;
            if (side > max) {
                max = side;
            }
        }

        // 삼각형 조건 확인
        sum -= max;
        return (max < sum) ? 1 : 2;
    }

    public static void main(String[] args) {
        Main20250202 solution = new Main20250202();

        System.out.println(solution.solution(new int[]{1, 2, 3}));  // 2
        System.out.println(solution.solution(new int[]{3, 6, 2}));  // 2
        System.out.println(solution.solution(new int[]{199, 72, 222}));  // 1
    }
}