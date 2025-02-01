package programmers.머쓱이보다키큰사람;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120585
제한 시간: 30분
사용 시간: 15분 27초
문제 접근 방식:for (int h : array): 배열의 모든 요소를 순회
if (h > height): 머쓱이의 키보다 큰 경우 카운트를 증가시키자

*/
public class Main20250201 {
    public static int solution(int[] array, int height) {
        int count = 0;

        for (int h : array) {
            if (h > height) {
                count++;
            }
        }

        return count;
    }
    //테스트 코드
    public static void main(String[] args) {
        System.out.println(solution(new int[]{149, 180, 192, 170}, 167)); // 3
        System.out.println(solution(new int[]{180, 120, 140}, 190));      // 0
    }
}


