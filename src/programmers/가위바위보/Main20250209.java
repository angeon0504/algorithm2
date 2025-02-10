package programmers.가위바위보;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120839
제한 시간: 30분
사용 시간: 7분 초
문제 접근 방식: switch문으로 각 입력 값에 대해 이기는 값을 설정하여 풀어보자

*/
public class Main20250209 {
    public static String solution(String rsp) {
        StringBuilder result = new StringBuilder();

        for (char ch : rsp.toCharArray()) {
            switch (ch) {
                case '2': result.append('0'); break;  // 가위 -> 바위
                case '0': result.append('5'); break;  // 바위 -> 보
                case '5': result.append('2'); break;  // 보 -> 가위
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // 테스트 코드
        System.out.println(solution("2"));
        System.out.println(solution("205"));
    }
}

