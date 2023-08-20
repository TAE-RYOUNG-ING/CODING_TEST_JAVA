package lv_1;



// 풀이시간 00:16:30 & 제출점수 100점



public class 평균구하기 {
	
	class Solution {
		
	    public double solution(int[] arr) {
	        
	        int sum = 0;
			int count = 0;
	        
	        for(int i=0; i<arr.length; i++) {
	            sum += arr[i];
	            count++;
			}
	        
	        return (double)sum / count;
	        
	    }
	    
	}  // solution
	
}
