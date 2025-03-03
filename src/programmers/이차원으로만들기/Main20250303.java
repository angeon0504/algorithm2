package programmers.이차원으로만들기;

import java.util.Arrays;


/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120842
제한 시간: 30분
사용 시간: 27분 초
num_list.length / n을 이용해 행(row)의 개수를 구함.
int[][] result = new int[rows][n]; 을 사용해 2차원 배열을 선언.
for 문을 돌면서 System.arraycopy()를 활용해 num_list에서 n개씩 잘라 result의 각 행에 저장.

*/
public class Main20250303 {
    public int[][] solution(int[] num_list, int n) {
        int rows = num_list.length / n; // 행 개수 계산
        int[][] result = new int[rows][n]; // 2차원 배열 생성

        for (int i = 0; i < rows; i++) {
            System.arraycopy(num_list, i * n, result[i], 0, n); // 배열 복사
        }

        return result;
    }

    //테스트 코드
    public static void main(String[] args) {
        Main20250303 soltion = new Main20250303();
        System.out.println(Arrays.deepToString(soltion.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
        // 출력: [[1, 2], [3, 4], [5, 6], [7, 8]]

        System.out.println(Arrays.deepToString(soltion.solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3)));
        // 출력: [[100, 95, 2], [4, 5, 6], [18, 33, 948]]
    }
}










