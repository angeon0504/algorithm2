package programmers.칠의개수;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120890
제한 시간: 30분
사용 시간: 8분
문제해결방법:
for문을 사용하여 풀어보자

*/
public class Main20250313 {
    public int solution(int[] array) {
        int count = 0;
        for (int num : array) {
            count += countSevens(num);
        }
        return count;
    }

    private int countSevens(int num) {
        return (int) String.valueOf(num)
                .chars()
                .filter(c -> c == '7')
                .count();
    }

    public static void main(String[] args) {
        Main20250313 solution = new Main20250313 ();
        System.out.println(solution.solution(new int[]{7, 77, 17})); // 4
        System.out.println(solution.solution(new int[]{10, 29}));   // 0
    }
}












