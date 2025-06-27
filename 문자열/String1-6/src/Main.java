import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        String result = "";
        // 현재 위치와 문자열에서 해당 문자가 처음으로 발견되는 위치가 같을때만 추출
        for(int i=0; i<s.length(); i++){
            if(i == s.indexOf(s.charAt(i))){
                result+=s.charAt(i);
            }
        }
        System.out.println(result);
    }
}