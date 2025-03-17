package programmers.문자열계산하기;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120902
제한 시간: 30분
사용 시간: 18분
문제해결방법:
숫자에 해당하는 영어 단어와 숫자를 매핑
영어 단어를 해당 숫자로 변환
*/
public class Main20250317 {
    public static int solution(String numbers) {

        String[] numWords = { "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine" };


        for (int i = 0; i < numWords.length; i++) {
            numbers = numbers.replace(numWords[i], String.valueOf(i));
        }

        return Integer.parseInt(numbers);
    }

    public static void main(String[] args) {
        // 테스트 케이스 실행
        System.out.println(solution("onetwothreefourfivesixseveneightnine"));
        System.out.println(solution("onefourzerosixseven"));
    }
}












