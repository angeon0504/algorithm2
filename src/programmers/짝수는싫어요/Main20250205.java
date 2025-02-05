package programmers.짝수는싫어요;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120813
제한 시간: 30분
사용 시간: 26분 초
문제 접근 방식:배수의 개수 세기: 첫 번째 순회에서 numlist 배열을 순회하며 n의 배수인 숫자의 개수를 세고
 count 변수에 배수의 개수를 저장
결과 배열 만들기: count를 이용해 결과 배열(result)을 만들고, 두 번째 순회에서 배수인 숫자들을 result 배열에 넣기
결과 반환: 최종적으로 배수만 포함된 result 배열을 반환

*/
public class Main20250205 {
    public int[] solution(int n) {
        // 홀수의 개수를 계산
        int count = (n + 1) / 2;  // n이 홀수일 경우 (n+1)/2가 홀수 개수, 짝수일 경우 n/2
        int[] result = new int[count];

        // 홀수만 result 배열에 저장
        int index = 0;
        for (int i = 1; i <= n; i += 2) {
            result[index++] = i;
        }

        return result;
    }

    public static void main(String[] args) {
        Main20250205 soltion = new Main20250205();

        //테스트 코드
        int[] result1 = soltion.solution(10);
        for (int num : result1) System.out.print(num + " ");  // [1, 3, 5, 7, 9]
        System.out.println();

        int[] result2 = soltion.solution(15);
        for (int num : result2) System.out.print(num + " ");  // [1, 3, 5, 7, 9, 11, 13, 15]
        System.out.println();
    }
}