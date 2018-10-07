package codility;

import java.util.Arrays;

public class PermCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(new int[] { 1, 1}));

	}
	
	public static int solution(int[] A) {
		Arrays.sort(A);
        //for(int i:A){ System.out.println(i);}
        for(int i = 0; i<A.length; i++){
            if(A[i] - i != 1){
                return 0;
            }
        }
        
        return 1;
    }
}
