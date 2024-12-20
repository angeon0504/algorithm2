public class 알고리즘10 {
    public int[] solution(int[] numbers) {

        int[] result = new int[numbers.length];


        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] * 2;
        }

        return result;
    }

    public static void main(String[] args) {
        알고리즘10 sol = new 알고리즘10();

        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 2, 100, -99, 1, 2, 3};

        System.out.println(java.util.Arrays.toString(sol.solution(numbers1))); // 출력: [2, 4, 6, 8, 10]
        System.out.println(java.util.Arrays.toString(sol.solution(numbers2))); // 출력: [2, 4, 200, -198, 2, 4, 6]
    }
}
