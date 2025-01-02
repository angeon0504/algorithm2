package programmers;

import java.util.Arrays;

/*
문제링크 https://school.programmers.co.kr/learn/courses/30/lessons/120830
제한시간 30분
문제접근방식: for 루프를 사용하여 시간마다 두배로 계산하자
*/
public class Main2025_01_02_2 {
    public static int solution(int n, int k) {
        int lambPrice = 12000;
        int drinkPrice = 2000;


        int freeDrinks = n / 10;

        int paidDrinks = k - freeDrinks;

        int totalCost = (n * lambPrice) + (paidDrinks * drinkPrice);

        return totalCost;
    }

    public static void main(String[] args) {
        // 테스트 케이스 실행
        System.out.println(solution(10, 3));
        System.out.println(solution(64, 6));
    }
}

