package programmers.인덱스바꾸기;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120851
제한 시간: 30분
사용 시간: 16분 초
문제 접근 방식: 1.toCharArray()를 사용해 문자열을 문자 배열로 변환합니다. (문자열은 불변이므로 배열로 변환해야 수정 가능)
2.num1과 num2 위치의 문자를 교환
3.new String(charArray)로 다시 문자열로 변환하여 반환
*/
public class Main20250215 {
    public String solution(String my_string, int num1, int num2) {
        char[] charArray = my_string.toCharArray(); // 문자열을 문자 배열로 변환
        char temp = charArray[num1]; // num1 위치의 문자 저장
        charArray[num1] = charArray[num2]; // num1 위치에 num2의 문자 저장
        charArray[num2] = temp; // num2 위치에 원래 num1의 문자 저장
        return new String(charArray); // 문자 배열을 다시 문자열로 변환하여 반환
    }

    public static void main(String[] args) {
        Main20250215 solution = new Main20250215();
        System.out.println(solution.solution("hello", 1, 2));
        System.out.println(solution.solution("I love you", 3, 6));
    }
}
