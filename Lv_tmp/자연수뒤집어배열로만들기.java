import java.util.*;



// 풀이시간 00:08:11 & 제출점수 100점



public class 자연수뒤집어배열로만들기 {

	class Solution {
	    
		public List<Long> solution(long n) {
	        
	        List<Long> list = new ArrayList<Long>();
			
	        while(n > 0) {
	        	long tmp = n % 10;	// 나머지
	        	list.add(tmp);
	        	n /= 10;            // 몫
	        }
	        
	        return list;
	        
	    }
		
	} // Solution
	
}