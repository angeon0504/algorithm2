package programmers.A를B로만들기;

import java.util.Arrays;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120886
제한 시간: 30분
사용 시간: 12분 초
문제해결방법:
문자열을 문자 배열로 변환
→ toCharArray() 사용
배열을 정렬
→ Arrays.sort() 사용
두 배열이 같은지 비교
→ Arrays.equals() 사용
*/
public class Main20250304 {
    public static int solution(String before, String after) {

        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);


        return Arrays.equals(beforeArr, afterArr) ? 1 : 0;
    }

    public static void main(String[] args) {
        String before1 = "olleh";
        String after1 = "hello";
        System.out.println("결과: " + solution(before1, after1)); // 1

        String before2 = "allpe";
        String after2 = "apple";
        System.out.println("결과: " + solution(before2, after2)); // 0
    }
}










