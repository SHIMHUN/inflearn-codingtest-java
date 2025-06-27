import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s = sc.next().toLowerCase();
        // 1. 반목문으로 비교하면서 회문 확인
        s = s.toLowerCase();
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

//        // 2.StringBuilder, reverse 사용해서 비교
//        StringBuilder sb = new StringBuilder(s);
//        if(sb.reverse().toString().equalsIgnoreCase(s)){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
    }
}