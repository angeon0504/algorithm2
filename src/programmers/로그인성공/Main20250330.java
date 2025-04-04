package programmers.로그인성공;

/*
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120883
제한 시간: 30분
사용 시간: 20분
문제해결방법:
 아이디와 비밀번호가 모두 맞으면 "login"
아이디는 맞지만 비밀번호가 다르면 "wrong pw"
아이디가 존재하지 않으면 "fail"
로 만들어서 풀어보자

*/
public class Main20250330 {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];

        for (String[] user : db) {
            if (user[0].equals(id)) {
                return user[1].equals(pw) ? "login" : "wrong pw";
            }
        }

        return "fail";
    }

    public static void main(String[] args) {
        Main20250330 solution = new Main20250330();

        // 로그인 테스트
        System.out.println(solution.solution(new String[]{"meosseugi", "1234"},
                new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}));
        System.out.println(solution.solution(new String[]{"programmer01", "15789"},
                new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}}));
        System.out.println(solution.solution(new String[]{"rabbit04", "98761"},
                new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}}));
    }
}













