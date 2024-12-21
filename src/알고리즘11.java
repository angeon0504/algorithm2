public class 알고리즘11 {
    public static int soultion(int angle) {
        if (angle > 0 && angle < 90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (angle > 90 && angle < 180) {
            return 3;
        } else if (angle == 180) {
            return 4;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(soultion(70));  // 1
        System.out.println(soultion(91));  // 3
        System.out.println(soultion(180)); // 4
    }
}
