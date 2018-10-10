package test;

import java.util.Arrays;

public class MissingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(new int[] {1, 3, 6, 4, 1, 2}));

	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int count = 1;
        for(int i = 0; i<A.length; i++){
            if(A[i] < 0){
                continue;
            }
            else{
                if(count == A[i]){
                    count++;
                }
            }
        }
        
        /*int count = 1;
        for(int i = 0; i<A.length; i++){
            for(int j = 0; j<A.length; j++){
                if(A[i] < 0){
                    break;
                }
                else{
                    if(count == A[j]){
                        count++;
                        break;
                    }
                }
            }
        }*/
        
        return count;
    }

}
