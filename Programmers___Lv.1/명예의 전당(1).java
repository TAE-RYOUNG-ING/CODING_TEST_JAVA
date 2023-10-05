
// 풀이시간 46:24


class Solution {
	public int[] solution(int k, int[] score) {
	      
		List<Integer> goat = new ArrayList<>();
		int[] answer = new int[score.length];
		
		// k가 score 길이보다 클 경우
		if(k > score.length) {
			k = score.length;
		}
		      
		// k일까지의 발표점수
		for(int i=0; i<k; i++) {
			goat.add(score[i]);
			Collections.sort(goat);
			answer[i] = goat.get(0);
		}
		
		// k+1일부터 발표점수
		for(int i=k; i<score.length; i++) {
			if(goat.size() > k) {
				goat.remove(k);
			}
			goat.add(score[i]);
			Collections.sort(goat, Collections.reverseOrder());
			answer[i] = goat.get(k-1);
		}
	
		return answer;
	}
}
