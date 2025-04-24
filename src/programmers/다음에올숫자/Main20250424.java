package programmers.다음에올숫자;
/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120924
제한 시간: 30분
사용 시간: 30분
문제해결방법:
 수열이 자기 자신이 처리 할 수 있는지 확인하는  메서드와 다음값을 계산하는 메서드를 만들고
 등차 수열인지 등비 수열인지 확인하는 클래스를 만든다
 그걸 구하는 메서드를 구현하여 처리한다
*/
 interface Sequence {
    boolean matches(int[] nums);
    int nextValue(int[] nums);
}
class ArithemeticSeqence implements Sequence{

    @Override
    public boolean matches(int[] nums) {
        int diff =nums[1] - nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] != diff) {
                return false;
        }
    }
        return true;

    }

    @Override
    public int nextValue(int[] nums) {
        int diff = nums[1] - nums[0];
        return nums[nums.length - 1] + diff;
    }
}

class GeometricSqence implements Sequence {

    @Override
    public boolean matches(int[] nums) {
        int ratio = nums[1] / nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i + 1]/nums[i] !=ratio) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int nextValue(int[] nums) {
        int ratio = nums[1]/ nums[0];
        return nums[nums.length - 1] * ratio;
    }
}
public class Main20250424 {
    private final Sequence[] seqences ={
            new ArithemeticSeqence(),
            new GeometricSqence()
    };
    public int solution(int[] common) {
        for (Sequence seqence : seqences) {
            if(seqence.matches(common)){
                return seqence.nextValue(common);
            }
        }
        throw new IllegalArgumentException(" 주어진 수열은 등차수열도 등비수열도 아닙니다,");
    }
    //테스트코드
    public static void main(String[] args) {
        Main20250424 solver = new Main20250424();
        int[] ex1 = {1, 2, 3, 4};
        int[] ex2 = {2, 4, 8};

        System.out.println(solver.solution(ex1));
        System.out.println(solver.solution(ex2));
    }
}