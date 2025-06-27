import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        char[] charArray = s.toCharArray();
        int lt = 0, rt = s.length()-1;

        while(lt < rt){
            if(!Character.isAlphabetic(charArray[lt])) lt++;
            else if(!Character.isAlphabetic(charArray[rt])) rt--;
            else{
                char tmp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = tmp;
                lt++;
                rt--;
            }
        }

        System.out.println(String.valueOf(charArray));
    }
}