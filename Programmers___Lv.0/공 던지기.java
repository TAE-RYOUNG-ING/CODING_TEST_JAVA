// 풀이시간 08:33


class Solution {
  public int solution(int[] numbers, int k) {
    
    int answer = 0, idx = 0;

		for(int i=1; i<k; i++) {
			idx += 2;
		}

		idx %= numbers.length;
		answer = numbers[idx];
		
		return answer;
  }
}
