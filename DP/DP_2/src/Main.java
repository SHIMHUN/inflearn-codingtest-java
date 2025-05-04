import java.util.*;

public class Main {
    static Integer[] DP;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        DP = new Integer[N+2]; //DP배열 초기에 null로 초기화

        DP[1] = 1;
        DP[2] = 2;

//        //1. Down-Top
//        for(int i=3; i<=N+1; i++){
//            DP[i] = DP[i-1] + DP[i-2];
//        }
//        System.out.println(DP[N+1]);

        //2. Top-down
        System.out.println(recur(N+1));
    }

    static int recur(int N){
        if(DP[N] == null){
            DP[N] = recur(N-1) + recur(N-2);
        }

        return DP[N];
    }
}