package programmers.특이한정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120863
제한 시간: 30분
사용 시간: 20분
문제해결방법:
NumberWithDistance 클래스를 통해 정렬 기준 정보를 함께 다룸.
Comparator로 정렬 기준을 명확히 설정.
리스트를 정렬 후 배열로 변환하여 반환.

*/
public class Main20250418 {
    public int[] solution(int[] numlist, int n) {
        List<NumberWithDistance> list = new ArrayList<>();
        for (int num : numlist) {
            list.add(new NumberWithDistance(num, Math.abs(num - n)));
        }


        list.sort((a, b) -> {
            if (a.distance == b.distance) {
                return b.number - a.number;
            } else {
                return a.distance - b.distance;
            }
        });


        int[] result = new int[numlist.length];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i).number;
        }

        return result;
    }


    static class NumberWithDistance {
        int number;
        int distance;

        public NumberWithDistance(int number, int distance) {
            this.number = number;
            this.distance = distance;
        }
    }

    // 테스트 코드
    public static void main(String[] args) {
        Main20250418 solution = new Main20250418();

        System.out.println(Arrays.toString(solution.solution(new int[]{1, 2, 3, 4, 5, 6}, 4)));


        System.out.println(Arrays.toString(solution.solution(new int[]{10000, 20, 36, 47, 40, 6, 10, 7000}, 30)));
    }
}













