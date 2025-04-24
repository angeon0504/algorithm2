package programmers.연속된수의합;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120863
제한 시간: 30분
사용 시간: 30분
문제해결방법:
연속된 수의 개수연속된 수열을 계산하는 메서드를 만들고  주어진 수의 개수(num)와 합(total)에 맞는 연속된 수열을 반환하는 메서드를 만들어서 계산한다
*/
public class Main20250424 {
static class Sequence {
    private int num;
    private int total;


    public Sequence(int num, int total) {
        this.num = num;
        this.total = total;
    }

    //
    public int[] generateSequence() {
        int start = (total - (num * (num - 1) / 2)) / num;  // 시작 값 계산
        int[] sequence = new int[num];

        // 연속된 수들 생성
        for (int i = 0; i < num; i++) {
            sequence[i] = start + i;
        }

        return sequence;
    }


    public static int[] solution(int num, int total) {
        Sequence sequence = new Sequence(num, total);
        return sequence.generateSequence();
    }

    public static void main(String[] args) {
        // 예시 실행
        int[] result1 = Sequence.solution(3, 12);
        int[] result2 = Sequence.solution(5, 15);
        int[] result3 = Sequence.solution(4, 14);
        int[] result4 = Sequence.solution(5, 5);

        // 결과 출력
        System.out.println(java.util.Arrays.toString(result1));  // [3, 4, 5]
        System.out.println(java.util.Arrays.toString(result2));  // [1, 2, 3, 4, 5]
        System.out.println(java.util.Arrays.toString(result3));  // [2, 3, 4, 5]
        System.out.println(java.util.Arrays.toString(result4));  // [-1, 0, 1, 2, 3]
    }
}}













