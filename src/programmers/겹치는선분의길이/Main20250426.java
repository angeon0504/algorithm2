package programmers.겹치는선분의길이;
/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/1208763
제한 시간: 30분
사용 시간: 30분
문제해결방법:
 addLine:선분 범위를 points 배열에 표시한다	(start 이상, end 미만 범위)
calculateOverlapLength:겹치는 지점의 수를 센다	(2개 이상 겹친 곳만)
*/
public class Main20250426 {
    public static int solution(int[][] lines) {
        ICalculator calculator = new OverlapCalculator();

        for (int[] line : lines) {
            calculator.addLine(new Line(line[0],line[1]));
        }
        return calculator.calculateOverlapLength();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 1}, {2, 5}, {3, 9}}));
        System.out.println(solution(new int[][]{{-1, 1}, {1, 3}, {3, 9}}));
        System.out.println(solution(new int[][]{{0, 5}, {3, 9}, {1, 10}}));
    }
}

