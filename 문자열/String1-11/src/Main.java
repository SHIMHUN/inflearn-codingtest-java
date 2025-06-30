import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s = sc.next() + " "; // 추가된 공백은 마지막 문자 고려(강제 비교)


        int cnt = 1;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)) cnt++;
            else{
                sb.append(s.charAt(i));
                if(cnt > 1) sb.append(cnt);
                cnt=1;
            }
        }

        System.out.println(sb);
    }
}