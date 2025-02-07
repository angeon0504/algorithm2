package programmers.옷가게할인받기;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120818
제한 시간: 30분
사용 시간: 19분 초
문제 접근 방식:  price * discount / 100으로 할인 금액을  이를 원래 가격에서 빼면 최종 지불해야 할 금액을 구할 수 있dma

*/

public class Main20250207 {
    public int solution(int price) {
        int discount = 0;

        if (price >= 500000) {
            discount = 20;
        } else if (price >= 300000) {
            discount = 10;
        } else if (price >= 100000) {
            discount = 5;
        }


        int finalPrice = price - (price * discount / 100);

        return finalPrice;
    }
    //테스트 코드
    public static void main(String[] args) {
        Main20250207 solution = new Main20250207();

        System.out.println(solution.solution(150000));  // 출력: 142500
        System.out.println(solution.solution(580000));  // 출력: 464000
    }
}
