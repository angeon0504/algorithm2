package programmers.n의배수고르기;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120905
제한 시간: 30분
사용 시간: 26분 초
문제 접근 방식:배수의 개수 세기: 첫 번째 순회에서 numlist 배열을 순회하며 n의 배수인 숫자의 개수를 세고
 count 변수에 배수의 개수를 저장
결과 배열 만들기: count를 이용해 결과 배열(result)을 만들고, 두 번째 순회에서 배수인 숫자들을 result 배열에 넣기
결과 반환: 최종적으로 배수만 포함된 result 배열을 반환

*/
public class Main20250205 {
    public int[] solution(int n, int[] numlist) {

        int count = 0;
        for (int num : numlist) {
            if (num % n == 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int num : numlist) {
            if (num % n == 0) {
                result[index++] = num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main20250205 sol = new Main20250205();

        // 테스트 코드
        int[] result1 = sol.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12});
        for (int num : result1) System.out.print(num + " ");  // [6, 9, 12]
        System.out.println();

        int[] result2 = sol.solution(5, new int[]{1, 9, 3, 10, 13, 5});
        for (int num : result2) System.out.print(num + " ");  // [10, 5]
        System.out.println();

        int[] result3 = sol.solution(12, new int[]{2, 100, 120, 600, 12, 12});
        for (int num : result3) System.out.print(num + " ");  // [120, 600, 12, 12]
        System.out.println();
    }
}