package codility;

public class BinaryGaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Solution is " + solution(0));

	}
	
	 public static int solution(int N) {
	        // write your code in Java SE 8
	        int max = 0;
	        int count = 0;
	        boolean flag = false;
	        String a="";
	        
	        while(N>0){
	            if(N%2 == 0){
	                count++;
	            }
	            else{
	                    flag = true;
	                    count = 0;
	                }
	            
	            if(flag==true && max<count){
	                max = count;
	            }
	            a = N%2 + a;
	            N = N/2;
	        }
	        return max;
	    }

}
