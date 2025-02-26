package programmers.배열회전시키기;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120844
제한 시간: 30분
사용 시간: 11분 초
문제 접근 방식: numbers 배열과 direction 문자열이 주고
numbers의 길이를 length 변수에 저장
회전된 결과를 저장할 rotated 배열을 같은 길이로 선언.
*/
public class Main20250226 {
    public static int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] rotated = new int[length];

        if (direction.equals("right")) {
            rotated[0] = numbers[length - 1];
            System.arraycopy(numbers, 0, rotated, 1, length - 1);
        } else if (direction.equals("left")) {
            System.arraycopy(numbers, 1, rotated, 0, length - 1);
            rotated[length - 1] = numbers[0];
        }

        return rotated;
    }

    public static void main(String[] args) {
        int[] result1 = solution(new int[]{1, 2, 3}, "right");
        int[] result2 = solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left");

        System.out.println(java.util.Arrays.toString(result1)); // [3, 1, 2]
        System.out.println(java.util.Arrays.toString(result2)); // [455, 6, 4, -1, 45, 6, 4]
    }
}

