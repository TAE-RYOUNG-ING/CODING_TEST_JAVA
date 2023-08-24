


// 풀이시간 00:15:55 & 제출점수 100점



public class 정수제곱근판별 {

	class Solution {
		
	    public long solution(long n) {
	        long answer = 0;
	        
	        for(long i=1; i <= n; i++) {
				if(n == i*i) {
					answer = (i+1)*(i+1);
					break;
				}
				else {
					answer = -1;
				}
			}
	        
	        return answer;
	        
	    }
	    
	} // Solution
	
}