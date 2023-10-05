
// 풀이시간 32:13


class Solution {
  public int[] solution(String s) {
      
    int[] answer = new int[s.length()];
    int tmp;
    
    for(int i=s.length()-1; i>=0; i--) {
      tmp = s.substring(0, i).lastIndexOf(s.charAt(i));
      if(tmp != -1) {
        answer[i] = i-tmp;
      }
      else {
        answer[i] = tmp;
      }
    }
      
    return answer;
  }
}
