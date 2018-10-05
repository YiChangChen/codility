package codility;

public class TapeEquilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(new int[] { 3, 1, 2, 4, 3}));

	}


//O(n*n)
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int min = 100000;
        int left = 0;
        int right = 0;
        
        for(int i = 1; i<A.length; i++){
            for(int j = 0; j<i; j++){
                left += A[j];
            }
            for(int k = i; k<A.length; k++){
                right += A[k];
            }
            if(min > Math.abs(left-right)){
                min = Math.abs(left-right);
            }
            left = 0;
            right = 0;
        }
        return min;
    }
}