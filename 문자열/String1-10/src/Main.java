import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int[] result = new int[s.length()];
        int p = 1000;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == t.charAt(0)){
                p=0;
                result[i] = p;
            }
            else result[i] = ++p;
        }

        p=1000;

        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == t.charAt(0)){
                p=0;
                result[i] = p;
            }
            else result[i] = Math.min(++p, result[i]);
        }

        for(int i : result){
            System.out.print(i + " ");
        }
    }
}