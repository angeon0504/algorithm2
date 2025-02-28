package programmers.모스부호;

import java.util.HashMap;

import java.util.Map;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120838
제한 시간: 30분
사용 시간: 25분 초
모스부호-알파벳 변환 맵 생성:
HashMap<String, String>을 이용하여 모스부호와 알파벳을 매핑합니다.
입력 문자열을 공백으로 분리 후 변환:
split(" ")을 이용해 모스부호를 분리하고, morseMap을 이용해 변환합니다.
테스트 케이스를 직접 실행하고 검증:
".... . .-.. .-.. ---" → "hello"
".--. -.-- - .... --- -." → "python"
결과가 기대한 정답과 일치하는지 확인(output.equals(expected)).


*/
public class Main20250228 {
    public static String solution(String letter) {

        Map<String, String> morseMap = new HashMap<>();
        String[] morseArray = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        char alphabet = 'a';


        for (String morse : morseArray) {
            morseMap.put(morse, String.valueOf(alphabet));
            alphabet++;
        }

        // 공백을 기준으로 문자열을 분리하여 해독
        StringBuilder result = new StringBuilder();
        String[] words = letter.split(" ");

        for (String word : words) {
            result.append(morseMap.get(word));
        }

        return result.toString();
    }
    //테스트 코드
    public static void main(String[] args) {

        String input1 = ".... . .-.. .-.. ---";
        String expected1 = "hello";
        String output1 = solution(input1);
        System.out.println("입력: " + input1);
        System.out.println("출력: " + output1);
        System.out.println("정답 여부: " + output1.equals(expected1));

        System.out.println();


        String input2 = ".--. -.-- - .... --- -.";
        String expected2 = "python";
        String output2 = solution(input2);
        System.out.println("입력: " + input2);
        System.out.println("출력: " + output2);
        System.out.println("정답 여부: " + output2.equals(expected2));
    }
}










