package programmers기초.문자열곱하기;
/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181940
제한 시간: 20분
사용 시간: 10분 초
문제 해결방법: StringBuilder를 사용해서 문자열을 효율적으로 이어붙이기
for문으로 각 인덱스의 문자를 번갈아 append 하기
마지막에 toString()으로 문자열을 리턴
*/
public class Main20250610 {
    public  static String soltuion(String my_string, int k ) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <k; i++) {
            sb.append(my_string);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(soltuion("string", 3));
    }
}
