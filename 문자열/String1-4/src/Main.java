import java.util.Scanner;

public class Main {
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            String word = sc.next();
            solution(word);
        }

        System.out.println(result);
    }

    public static void solution(String word){
//        /*
//        * 1. StringBuilder 활용
//        * */
//        StringBuilder sb = new StringBuilder(word);
//        result.append(sb.reverse().toString() + "\n");

        /*
        * 2. charArray 활용
        * */
        char[] charArray = word.toCharArray();
        int lt=0, rt=word.length()-1;

        if(word.length() % 2 == 0){ //짝수
            while(lt<rt){
                char temp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;
                lt++;
                rt--;
            }
        }else{ //홀수
            while(lt!=rt){
                char temp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;
                lt++;
                rt--;
            }
        }

        result.append(String.valueOf(charArray) + "\n");
    }
}