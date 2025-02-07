package programmers.중앙값구하기;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120811
제한 시간: 30분
사용 시간: 29분 초
문제 접근 방식:  배열을 오름차순으로 정렬 중앙값 반환하여 구하기

*/
import java.util.Arrays;

public class Main20250207 {
    public int solution(int[] array) {

        Arrays.sort(array);  // 배열을 오름차순으로 정렬
        return array[array.length / 2];  // 중앙값 반환
    }
    //테스트 코드
    public static void main(String[] args) {
        Main20250207 solution = new Main20250207();

        int[] array1 = {1, 2, 7, 10, 11};
        System.out.println(solution.solution(array1));

        int[] array2 = {9, -1, 0};
        System.out.println(solution.solution(array2));
    }
}
