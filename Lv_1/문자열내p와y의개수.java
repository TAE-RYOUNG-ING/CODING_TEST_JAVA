


// 풀이시간 00:16:04 & 제출점수 100점



public class 문자열내p와y의개수 {

	class Solution {
		
	    boolean solution(String s) {
	        
	        int cntP = 0;
			int cntY = 0;
			
			// 문자열 -> 배열로 변환
			// toCharArray() 메서드 사용, 문자열을 char타입의 배열로 변환.
			char[] arr = s.toCharArray();
	        
			for(int i=0; i < arr.length; i++) {
				if(arr[i] == 'p' | arr[i] == 'P') {
					cntP++;
				}
				else if(arr[i] == 'y' | arr[i] == 'Y') {
					cntY++;
				}
			}
			
			if(cntP == cntY) {
				return true;
			}
			else{
				return false;
			}

	    } // boolean solution
	    
	} // Solution
	
}