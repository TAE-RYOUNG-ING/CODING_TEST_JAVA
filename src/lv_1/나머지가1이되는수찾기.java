package lv_1;
import java.util.ArrayList;
import java.util.List;



// 풀이시간 00:13:47 & 제출점수 100점



public class 나머지가1이되는수찾기 {
	
	class Solution {
		
	    public int solution(int n) {

	        List<Integer> arr = new ArrayList<Integer>();
	        
	        for(int i=1; i <= n; i++) {
				if(n % i == 1) {
					arr.add(i);
				}
			}
	        
	        return arr.get(0);
	        
	    }
	    
	} // Solution
	
}
