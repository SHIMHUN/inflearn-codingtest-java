import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
//        int result = 0;
//        /*
//        * 1. 아스키 코드 사용
//        * */
//        for(char c : s.toCharArray()) {
//            if (c >= 49 && c <= 57) { // 숫자인 경우
//                result = result * 10 + (c - 48);
//            }
//        }

        /*
        * 2. 내장 함수 사용
        * */
        String result = "";
        for(char c : s.toCharArray()) {
            if (Character.isDigit(c)) { // 숫자인 경우
                result += c;
            }
        }
        System.out.println(Integer.parseInt(result));
    }
}