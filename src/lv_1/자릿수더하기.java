package lv_1;



// 풀이시간 00:13:34 & 제출점수 100점



public class 자릿수더하기 {

	public class Solution {
		
	    public int solution(int n) {

	        int sum = 0;
	        
	        while(n > 0) {
				sum += n % 10;
				n /= 10;
			}

	        return sum;
	        
	    }
	    
	} // Solution
	
}