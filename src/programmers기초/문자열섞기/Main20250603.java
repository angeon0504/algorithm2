package programmers기초.문자열섞기;
/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120838
제한 시간: 20분
사용 시간: 10분 초
문제 해결방법: StringBuilder를 사용해서 문자열을 효율적으로 이어붙이기
for문으로 각 인덱스의 문자를 번갈아 append 하기
마지막에 toString()으로 문자열을 리턴
*/
public class Main20250603 {
    public  static String soltuion(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            result.append(str1.charAt(i));
            result.append(str2.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str1 ="aaaaaa";
        String str2 ="bbbbbb";
        System.out.println(soltuion(str1,str2));
    }
}
