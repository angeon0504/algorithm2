package programmers.k의개수;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120887
제한 시간: 30분
사용 시간: 12분 초
문제해결방법:k를 문자열로 변환해 target에 저장.
i부터 j까지 반복하면서 각 숫자를 문자열로 변환.
"문자열 길이 - 특정 문자 제거 후 길이"를 활용해 k가 등장한 횟수를 계산.
최종적으로 count 값을 반환.
*/
public class Main20250303 {
    public int solution(int i, int j, int k) {
        int count = 0;
        String target = String.valueOf(k);

        for (int num = i; num <= j; num++) {
            String str = String.valueOf(num);
            count += str.length() - str.replace(target, "").length();
        }

        return count;
    }

    //테스트 코드
    public static void main(String[] args) {
        Main20250303 solution = new Main20250303();
        System.out.println(solution.solution(1, 13, 1));
        System.out.println(solution.solution(10, 50, 5));
        System.out.println(solution.solution(3, 10, 2));
    }
}










