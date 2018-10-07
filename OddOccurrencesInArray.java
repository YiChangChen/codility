package codility;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(new int[] {9,3,9,3,9,7,9}));

	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
        
        //Arrays.sort(A);
        int result = 0;
        for(int i = 0; i<A.length; i++){
            result ^= A[i];
        }
        return result;
    }

}
