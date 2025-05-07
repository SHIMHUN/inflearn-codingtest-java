import java.io.*;

public class Main {
    static Integer[] DP;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =Integer.parseInt(br.readLine());
        DP = new Integer[N+1];
        DP[1] = 1; //DP 초기값 세팅

        String[] arr = br.readLine().split(" ");
        int[] nums = new int[N];
        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(arr[i]);
        }

        int result = Integer.MIN_VALUE;

        for(int i=2; i<N; i++){
            //아래 루프 조건에 만족하지 않으면 최대 길이는 다시 1부터 초기화해야 하므로 초깃값 0으로 세팅
            int max_val = 0;

            for(int j=1; j<i; j++){ //현재 항보다 작은 항에 대해서 가장 값이 큰 항 구하기
                if(nums[i] > nums[j] && DP[j] > max_val){
                    max_val = DP[j];
                }
            }

            // 현재 DP는 그동안 가장 큰값 기준으로 +1
            // 인덱스가 작은 항을 탐색한 결과 모두 현재 항보다 크다면 최대 길이는 1이 됨
            DP[i] = max_val + 1;

//            if (result < DP[i]) result = DP[i];
            //루프마다 DP 배열 중 가장 큰 값 체크하여 최신화
            result = Math.max(DP[i], result);
        }

        System.out.println(result);
    }
}