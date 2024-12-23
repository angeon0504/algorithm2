package programmers;
    /**
     *
     *
     * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/120898
     *시간 제한  30분
     *쓴 시간  10분
     *문제 접근 방법
     * 글자 수를 세고 곱하기 2를 하자
     */
    public  class Main2024_12_23_1 {
        public  static int main2024_12_23_1(String message) {
            return message.length() * 2;
        }

        //테스트 코드
        public static void main(String[] args) {
            System.out.println(main2024_12_23_1("happy birthday!"));
            System.out.println(main2024_12_23_1("I love you~"));
        }
    }
