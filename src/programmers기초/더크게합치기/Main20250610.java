package programmers기초.더크게합치기;
/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181940
제한 시간: 20분
사용 시간: 10분 초
문제 해결방법: StringBuilder를 사용해서 문자열을 효율적으로 이어붙이기
for문으로 각 인덱스의 문자를 번갈아 append 하기
마지막에 toString()으로 문자열을 리턴
*/
public class Main20250610 {
    public  static int soltuion(int a, int b ) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);

        String concatAB = strA + strB;
        String concatBA = strB + strA;

        return Math.max(Integer.parseInt(concatAB), Integer.parseInt(concatBA));
    }




    public static void main(String[] args) {
        int a = 9;
        int b = 91;
        System.out.println(soltuion(a, b));
    }
}
