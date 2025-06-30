import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toUpperCase().replaceAll("[^A-Z]", "");

        String result = "";

        String str = new StringBuilder(s).reverse().toString();

        if (s.equals(str)) result = "YES";
        else result = "NO";

        System.out.println(result);
    }
}