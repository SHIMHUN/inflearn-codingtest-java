import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        String result = "";

        for(int i=0; i<cnt; i++){
            String bin = s.substring(0,7).replace('#','1').replace('*','0');

            // 2진수 -> 10진수
            int num = Integer.parseInt(bin, 2);

            // 10진수 -> 아스키코드
            result+= (char) num;

            s=s.substring(7);
        }

        System.out.println(result);
    }
}