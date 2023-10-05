
// 풀이시간 31:38


class Solution {
  public int[] solution(int[] array, int[][] commands) {
  
    int[] answer = new int[commands.length];
    
    for(int i=0; i<commands.length; i++) {
      int start = commands[i][0];
      int end = commands[i][1];
      int pick = commands[i][2] -1;
      int[] tmp = new int[end-start +1];
      
      for(int j=start-1, k=0; j<end; j++) {
        tmp[k] = array[j];
        k++;
      }
      
      Arrays.sort(tmp);
      answer[i] = tmp[pick];
    }
  
    return answer;
    }
}
