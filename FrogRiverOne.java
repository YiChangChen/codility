package codility;

public class FrogRiverOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(5, new int[] {1,3,1,4,2,3,5,4}));

	}
	
	 public static int solution(int X, int[] A) {
	        // write your code in Java SE 8
	        int[] road = new int[X+1];
	        int count = 0;
	        for(int i = 0; i<A.length; i++){
	            if(road[A[i]] == 0){
	                road[A[i]] = A[i];
	                count++;
	            }
	            if(count == X){
	                return i;
	            }
	        }
	        return -1;
	    }

}
