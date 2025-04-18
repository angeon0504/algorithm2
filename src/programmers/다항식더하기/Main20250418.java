package programmers.다항식더하기;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120863
제한 시간: 30분
사용 시간: 10분
문제해결방법:
simplify(): 항들을 파싱하고 계수 및 상수항을 계산한 후, 형식에 맞게 문자열을 조립해 반환

*/
public class Main20250418 {
    private final String polynomial;

    public Main20250418(String polynomial) {
        this.polynomial = polynomial;
    }

    public String simplify() {
        String[] terms = polynomial.split(" \\+ ");
        int xCoeff = 0;
        int constant = 0;

        for (String term : terms) {
            if (term.contains("x")) {
                String coeff = term.replace("x", "");
                xCoeff += coeff.isEmpty() ? 1 : Integer.parseInt(coeff);
            } else {
                constant += Integer.parseInt(term);
            }
        }

        StringBuilder result = new StringBuilder();
        if (xCoeff != 0) {
            if (xCoeff == 1) {
                result.append("x");
            } else {
                result.append(xCoeff).append("x");
            }
        }

        if (constant != 0) {
            if (result.length() > 0) {
                result.append(" + ");
            }
            result.append(constant);
        }

        return result.toString();
    }

    // 테스트 코드
    public static void main(String[] args) {
        Main20250418 ex1 = new Main20250418("3x + 7 + x");
        System.out.println(ex1.simplify());

        Main20250418 ex2 = new Main20250418("x + x + x");
        System.out.println(ex2.simplify());

        Main20250418 ex3 = new Main20250418("5 + 3");
        System.out.println(ex3.simplify());
    }
}













