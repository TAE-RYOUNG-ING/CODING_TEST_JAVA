// 풀이시간 25:22


class Solution {
  public int[] solution(int[] emergency) {

    int[] answer = new int[emergency.length];
    int[] copy = emergency.clone();        
    Arrays.sort(copy);

    for(int i=0; i<emergency.length; i++) {
      for(int j=0; j<emergency.length; j++) {
        if(copy[i] == emergency[j]) {
            answer[j] = emergency.length-i;
        }
      }
    }

    return answer;
  }
}
