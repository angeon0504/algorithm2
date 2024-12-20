public class 알고리즘9 {

    public int solution(int num1, int num2) {
        // 나머지를 계산하여 반환
        return num1 % num2;
    }

    public static void main(String[] args) {
        알고리즘9 sol = new 알고리즘9();

        int num1 = 3;
        int num2 = 2;

        System.out.println("나머지:" + sol.solution(num1,num2));
    }
}
