package codility;

public class PassingCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(new int[]{0,1,0,1,1}));

	}
	
	 public static int solution(int[] A) {
	        // write your code in Java SE 8
	        //O(n*n)   
		    int result = 0;
	        /*for(int i = 0; i<A.length;i++){
	            for(int j = i;j<A.length;j++){
	                if(A[i] == 0 && A[j] == 1){
	                    result++;
	                }
	            }
	        }*/
	        
	        // O(n)
	        int east = 0;
	        for(int i = 0; i<A.length; i++){
		       if(A[i] == 0){
		           east++;
		       }
		       else{
		           result+=east;
		       }
		   }
		   
		   if(Math.abs(result) > 1000000000){
		       return -1;
		   }
		   return result;
	    }
}
