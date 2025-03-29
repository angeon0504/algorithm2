package programmers.외계어사전;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120869
제한 시간: 30분
사용 시간: 27분
문제해결방법:
  spell 배열을 정렬하여 문자열로 변환
   dic의 각 단어를 정렬하고 spell과 일치하는지 확인
 일치하는 단어가 있으면 1 반환 없으면 2반환
*/
public class Main20250329 {
        public static int solution(String[] spell, String[] dic) {

            String target = String.join("", Arrays.stream(spell).sorted().toArray(String[]::new));


            for (String word : dic) {
                String sortedWord = String.join("", word.chars()
                        .sorted()
                        .mapToObj(c -> String.valueOf((char) c))
                        .toArray(String[]::new));
                if (sortedWord.equals(target)) {
                    return 1; //
                }
            }
            return 2;
        }

        public static void main(String[] args) {

            String[] spell1 = {"p", "o", "s"};
            String[] dic1 = {"sod", "eocd", "qixm", "adio", "soo"};
            System.out.println(solution(spell1, dic1));


            String[] spell2 = {"z", "d", "x"};
            String[] dic2 = {"def", "dww", "dzx", "loveaw"};
            System.out.println(solution(spell2, dic2));


            String[] spell3 = {"s", "o", "m", "d"};
            String[] dic3 = {"moos", "dzx", "smm", "sunmmo", "som"};
            System.out.println(solution(spell3, dic3));
        }
    }













