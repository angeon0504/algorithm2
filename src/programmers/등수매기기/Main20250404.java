
package programmers.등수매기기;
/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120882
제한 시간: 30분
사용 시간: 15
문제해결방법:
 averages[]: 각 학생의 평균 점수 저장
sortedList: 평균 점수를 담은 리스트를 내림차순 정렬
indexOf() + 1: 공동 등수를 위해 같은 평균의 첫 인덱스를 사용
*/

import java.util.*;

class Student {
    int index;
    double average;

    Student(int index, int[] scores) {
        this.index = index;
        this.average = (scores[0] + scores[1]) / 2.0;
    }
}

public class Main20250404 {
    public int[] solution(int[][] score) {
        int n = score.length;
        List<Student> students = new ArrayList<>();
        int[] result = new int[n];


        for (int i = 0; i < n; i++) {
            students.add(new Student(i, score[i]));
        }


        students.sort((a, b) -> Double.compare(b.average, a.average));


        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0 && students.get(i).average == students.get(i - 1).average) {

                result[students.get(i).index] = result[students.get(i - 1).index];
            } else {

                result[students.get(i).index] = rank;
            }
            rank++;
        }

        return result;
    }

    public static void main(String[] args) {
        Main20250404 solution = new Main20250404();
        System.out.println(Arrays.toString(solution.solution(
                new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}})));
        System.out.println(Arrays.toString(solution.solution(
                new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}})));

    }
}
