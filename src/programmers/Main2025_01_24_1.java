package programmers;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120830?language=java
제한 시간: 30분
사용 시간: 10분
문제 접근 방식:
- lambPrice와 drinkPrice: 양꼬치와 음료수의 가격을 각각 설정한다.
freeDrinks: 10인분마다 서비스로 제공되는 음료수 개수를 계산한다(n / 10).
totalCost: 양꼬치와 음료수의 총 비용을 계산하고, 서비스 음료수에 해당하는 금액을 차감한다..
*/

public class Main2025_01_24_1 {
    public int solution(int n, int k) {
        // 양꼬치 가격
        int lambPrice = 12000;
        // 음료수 가격
        int drinkPrice = 2000;
        // 서비스로 받은 음료수 개수
        int freeDrinks = n / 10;
        // 총 비용 계산
        int totalCost = (n * lambPrice) + (k * drinkPrice) - (freeDrinks * drinkPrice);
        return totalCost;
    }

    // 테스트용 main 함수
    public static void main(String[] args) {
        Main2025_01_24_1 sol = new Main2025_01_24_1();
        // 예제 테스트
        System.out.println(sol.solution(10, 3)); // 124000
        System.out.println(sol.solution(64, 6)); // 768000
    }
}
