

import java.util.ArrayList;
import java.util.List;



// 풀이시간 00:35:29 & 제출점수 100점



public class 약수의합 {
	
	class Solution {	
		
	    public int solution(int n) {
	        
	        int answer = 0;
	        List<Integer> divisor = new ArrayList<Integer>();
	        
	        // 나누었을 때 나머지가 0이 되는 것 == 약수
	        for(int i = 1; i <= n; i++){
	            if(n % i == 0){
	            	divisor.add(i);
	            }
	        }
	        
	        // 약수의 누적합 구하기
	        for(int num : divisor) {
				answer += num;
			}
	        
	        return answer;
	        
	    }
	    
	} // solution
	
}