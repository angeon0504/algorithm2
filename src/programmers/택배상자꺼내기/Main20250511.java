package programmers.택배상자꺼내기;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120890
제한 시간: 30분
사용 시간: 30분
문제해결방법:
층(floor)은 위에서부터 몇번째 행인지
열(col)은 해당 층이 짝수면  왼쪽에서 오른쪽 홀수면 오른쪽에서 왼쪽으로 결정
찾고자 하는 상자 위에 있는 같은 열의 상자들 개수를 세게 만들기
*/
public class Main20250511 {
    public static int solution(int n, int w, int num) {
        // 상자 번호 → (층, 열) 저장용 Map
        Map<Integer, int[]> positions = new HashMap<>();

        // 상자 배치
        for (int i = 0; i < n; i++) {
            int boxNum = i + 1;  // 상자 번호
            int floor = i / w;  // 몇 번째 층인지 계산
            int idxInRow = i % w;  // 현재 층에서의 열 번호
            int col;

            // 층에 따라 열 순서 결정
            if (floor % 2 == 0) {
                col = idxInRow;  // 짝수층 (왼→오)
            } else {
                col = w - 1 - idxInRow;  // 홀수층 (오→왼)
            }

            // positions에 상자 번호와 위치 저장
            positions.put(boxNum, new int[]{floor, col});
        }

        // 꺼내려는 상자의 좌표
        int[] target = positions.get(num);

        // num 상자가 존재하지 않으면 오류 처리
        if (target == null) {
            throw new IllegalArgumentException("잘못된 상자 번호입니다.");
        }

        int targetFloor = target[0];
        int targetCol = target[1];

        int count = 0;
        // 현재 상자 번호보다 위에 있는 모든 상자들
        for (int i = 1; i <= n; i++) {
            int[] pos = positions.get(i);
            if (pos == null) {
                continue; // null인 값이 있으면 스킵
            }
            int f = pos[0];
            int c = pos[1];

            // 같은 열에 있고, 현재 상자보다 층이 높은 상자들 카운트
            if (c == targetCol && f >= targetFloor) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(22, 6, 8));  // 3
        System.out.println(solution(13, 3, 6));  // 4
    }
}











