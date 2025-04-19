package programmers.최빈값구하기;

import java.util.*;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120863
제한 시간: 30분
사용 시간: 20분
문제해결방법:
HashMap을 사용해서 각 숫자의 빈도를 저장
최댓값 빈도를 기준으로:
가장 많이 나온 값이 하나뿐이면 그 값을 반환
여러 개면 -1을 반환

*/
public class Main20250419 {
    public int solution(int[] arrary) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arrary) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0) + 1);
        }
        int maxFreq = 0;
        int mode = -1;
        boolean isDuplicate = false;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq) {
                maxFreq =freq;
                mode = num;
                isDuplicate = false;
            }else if (freq == maxFreq) {
                isDuplicate = true;
            }
        }
            return  isDuplicate ? -1 : mode;
        }

    // 테스트 코드
    public static void main(String[] args) {
        Main20250419 solution = new Main20250419();

        System.out.println((solution.solution(new int[]{1, 2, 3, 4,})));
        System.out.println((solution.solution(new int[]{1})));
        System.out.println((solution.solution(new int[]{1, 1, 2, 2})));
    }
}













