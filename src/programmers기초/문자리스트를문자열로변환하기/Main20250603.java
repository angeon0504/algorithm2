package programmers기초.문자리스트를문자열로변환하기;
/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120838
제한 시간: 20분
사용 시간: 10분 초
문제 해결방법:
for - each문으로 배열의 원소를 차례대로 쓰기
*/
public class Main20250603 {
    public  static String soltuion(String[] arr) {
        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            sb.append(s);
        }


        return sb.toString();
    }

    public static void main(String[] args) {
        Main20250603 soltion = new Main20250603();
        String[] arr = {"a", "b", "c"};
        System.out.println(soltion.soltuion(arr));
    }
}
