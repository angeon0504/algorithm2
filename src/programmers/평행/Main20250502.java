package programmers.평행;

import programmers.겹치는선분의길이.ICalculator;
import programmers.겹치는선분의길이.Line;
import programmers.겹치는선분의길이.OverlapCalculator;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/1208875
제한 시간: 30분
사용 시간: 30분
문제해결방법:
4개의 점 중 두 점씩 이어서 만든 직선 중에서 기울기가 같은 쌍이 있는지 확인하는 코드를 만든다
기울기가 같다는 것은 두 직선이 평행하다는 뜻이므로, 조건을 만족하면 1, 아니면 0을 반환한다
*/
public class Main20250502 {

        public static void main(String[] args) {
            int[][] dots1 = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
            int[][] dots2 = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};

            System.out.println(solution(dots1)); // ➞ 1
            System.out.println(solution(dots2)); // ➞ 0
        }

        public static int solution(int[][] dots) {

            if (isParallel(dots[0], dots[1], dots[2], dots[3])) return 1;
            if (isParallel(dots[0], dots[2], dots[1], dots[3])) return 1;
            if (isParallel(dots[0], dots[3], dots[1], dots[2])) return 1;

            return 0;
        }

        private static boolean isParallel(int[] a, int[] b, int[] c, int[] d) {
            int dx1 = b[0] - a[0];
            int dy1 = b[1] - a[1];
            int dx2 = d[0] - c[0];
            int dy2 = d[1] - c[1];


            return dy1 * dx2 == dy2 * dx1;
        }
    }

