package programmers기초.문자열겹쳐쓰기;

import java.util.Scanner;

public class Main20250518 {
   public static String solution(String my_string, String overwrite_string, int s) {

       String prefiex = my_string.substring(0, s);

       String suffix = my_string.substring(s + overwrite_string.length());

       return prefiex + overwrite_string + suffix;
   }

    public static void main(String[] args) {

       String result1 = solution("HelloWorld", "lloWorl",2);
        System.out.println(result1);

        String resull2 = solution("Porgram29b8UYP", "merS123", 7);
        System.out.println(resull2);
    }
}