package programmers;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120830
제한 시간: 30분
문제 접근 방식:
- for 루프를 사용하여 배열의 각 키를 확인합니다.
- 머쓱이보다 키가 큰 경우, `count`를 증가시킵니다.
*/

public class Main2025_01_12_1 {
    public int solution(int[] array, int height) {
        int count = 0;
        for (int h : array) {
            if (h > height) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Main2025_01_12_1 solution = new Main2025_01_12_1(); // 클래스 이름과 생성자 일치

        // 테스트 코드 1
        int[] array1 = {149, 180, 192, 170};
        int height1 = 167;
        System.out.println(solution.solution(array1, height1)); // 출력: 3

        // 테스트 코드 2
        int[] array2 = {180, 120, 140};
        int height2 = 190;
        System.out.println(solution.solution(array2, height2)); // 출력: 0
    }
}

