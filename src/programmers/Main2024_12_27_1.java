package programmers;


/*
문제링크:https://school.programmers.co.kr/learn/courses/30/lessons/120817
제한시간:30분
문제 풀이 방식 numbers를 sum에 더하고 합계를 배열의 길이로 나누어 평균을 계산하자
 */

public class Main2024_12_27_1 {
    public static  double solution(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    //테스트 코드
    public static void main(String[] args) {
        int[] test1 = {1,2,3,4,5,6,7,8,9,10};
        int[] test2 = {89,90,91,92,93,94,95,96,97,98,99};

        System.out.println(solution(test1));
        System.out.println(solution(test2));
    }
}
