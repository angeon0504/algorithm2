package programmers.옹알이2;
import java.util.*;
/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/1208875
제한 시간: 30분
사용 시간: 30분
문제해결방법:
4개의 점 중 두 점씩 이어서 만든 직선 중에서 기울기가 같은 쌍이 있는지 확인하는 코드를 만든다
기울기가 같다는 것은 두 직선이 평행하다는 뜻이므로, 조건을 만족하면 1, 아니면 0을 반환한다
*/
public class Main20250502 {
    public static void main(String[] args) {

        BabblingChecker babblingChecker = new BabblingChecker();


        String[] babbling1 = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] babbling2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};


        System.out.println(babblingChecker.countValidBabbling(babbling1)); // 1
        System.out.println(babblingChecker.countValidBabbling(babbling2)); // 3
    }
}

class BabblingChecker {

    private final String[] canSay = {"aya", "ye", "woo", "ma"};

    // 주어진 문자열 배열에서 발음할 수 있는 단어의 개수 반환
    public int countValidBabbling(String[] babbling) {
        int count = 0;
        // 각 단어를 Babbling 객체로 만들고, 유효한지 체크
        for (String word : babbling) {
            Babbling babblingObj = new Babbling(word);
            if (babblingObj.isValid()) {
                count++;
            }
        }
        return count;
    }
}

class Babbling {
    private String word;


    public Babbling(String word) {
        this.word = word;
    }

    public boolean isValid() {

        for (String say : new String[]{"aya", "ye", "woo", "ma"}) {
            if (word.contains(say + say)) {
                return false;
            }
        }


        for (String say : new String[]{"aya", "ye", "woo", "ma"}) {
            word = word.replace(say, " ");
        }

        
        return word.trim().isEmpty();
    }
}

