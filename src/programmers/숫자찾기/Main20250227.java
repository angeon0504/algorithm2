package programmers.숫자찾기;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120904
제한 시간: 30분
사용 시간: 11분 초
문제 접근 방식:indexOf(String.valueOf(k))를 사용하여 k가 처음 등장하는 인덱스를 찾음.
indexOf()는 문자열에서 특정 문자의 위치를 0부터 시작하는 인덱스로 반환함.
만약 k가 num에 없으면 -1을 반환함.
결과적으로, 인덱스가 -1이 아니면 1-based index로 반환해야 하므로 +1을 해줌.
*/
public class Main20250227 {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num); // 정수를 문자열로 변환
        int index = numStr.indexOf(String.valueOf(k)); // k의 위치 찾기
        return index == -1 ? -1 : index + 1; // 0-based index이므로 +1
    }
    //테스트 코드
    public static void main(String[] args) {
        Main20250227 solution = new Main20250227();
        System.out.println(solution.solution(29183, 1));
        System.out.println(solution.solution(232443, 4));
        System.out.println(solution.solution(123456, 7));
    }
}


