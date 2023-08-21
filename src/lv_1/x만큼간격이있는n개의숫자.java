package lv_1;



// 풀이시간 01:03:25 & 제출점수 100점



public class x만큼간격이있는n개의숫자 {

	class Solution {
		
	    public long[] solution(int x, int n) {
	        
	        long[] answer = new long[n];
	        
	        for(int i=0; i < n; i++){
	            answer[i] = x * ((long)i+1);
	            // long타입으로 변환 -> 에러 방지
	        }
	        
	        return answer;
	        
	    }
	    
	} // Solution
	
}