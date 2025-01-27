package programmers;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120849
제한 시간: 30분
사용 시간: 22분 37초
문제 접근 방식:
-
vowels 배열에 모든 모음을 저장하고, 각 문자와 비교
입력 문자열을 toCharArray로 변환하여 각 문자를 순회
모음인지 확인하기 위해 vowels 배열과 비교
모음이 아닌 경우 추가:
모음이 아니면 result에 해당 문자를 추가
결과 반환:
최종적으로 StringBuilder를 문자열로 변환하여 반환
*/

public class Main2025_01_27_2 {
    public String solution(String my_string) {

        StringBuilder result = new StringBuilder();


        char[] vowels = {'a', 'e', 'i', 'o', 'u'};


        for (char ch : my_string.toCharArray()) {
            boolean isVowel = false;


            for (char vowel : vowels) {
                if (ch == vowel) {
                    isVowel = true;
                    break;
                }
            }


            if (!isVowel) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Main2025_01_27_2 sol = new Main2025_01_27_2();

        // 테스트 예제
        System.out.println(sol.solution("bus"));
        System.out.println(sol.solution("nice to meet you"));
    }
}