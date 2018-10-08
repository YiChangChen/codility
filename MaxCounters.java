package codility;

import java.util.Arrays;

public class MaxCounters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(solution(5, new int[]{3,4,4,6,1,4,4})));

	}
	
	//O(M * N)
	public static int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int max = 0;
        int[] result = new int[N];
        
        for(int i = 0; i<A.length; i++){
            if(A[i] > N){
                for(int j = 0; j<result.length; j++){
                    result[j] = max;
                }
                continue;
            }
            result[A[i]-1]+=1;
            if(max < result[A[i]-1]){
                max = result[A[i]-1];
            }
        }
        return result;
    }

}
