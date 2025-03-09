package programmers.가까운수;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120890
제한 시간: 30분
사용 시간: 23분
문제해결방법:
for문을 사용하여 풀어보자

*/
public class Main20250309 {
    public static int solution(int[] array, int n) {
        int closest = array[0]; // 초기값을 배열의 첫 번째 요소로 설정

        for (int num : array) {

            if (Math.abs(num - n) < Math.abs(closest - n) ||
                    (Math.abs(num - n) == Math.abs(closest - n) && num < closest)) {
                closest = num;
            }
        }

        return closest;
    }
    //테스트 코드
    public static void main(String[] args) {

        System.out.println(solution(new int[]{3, 10, 28}, 20)); // 28
        System.out.println(solution(new int[]{10, 11, 12}, 13)); // 12
    }
}











