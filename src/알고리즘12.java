public class 알고리즘12 {
    public static int solution(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i+=2) {
            sum +=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(4));
    }
}
