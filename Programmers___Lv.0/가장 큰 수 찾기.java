// 풀이시간 09:36


class Solution {
  public int[] solution(int[] array) {
      
	  int[] answer = new int[2];
		        
		// 최댓값 구하기
		int[] tmp = array.clone();
		Arrays.sort(tmp);
		answer[0] = tmp[tmp.length-1];
		
		// 최댓값 인덱스
		for(int i=0; i<array.length; i++) {
			if(array[i] == answer[0]) answer[1] = i;
		}
      
    return answer;
  }
}
