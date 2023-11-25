// 풀이시간 25:02


class Solution {
  public int[] solution(String[] keyinput, int[] board) {

    int[] answer = new int[2];
    int x = board[0]/2, y = board[1]/2;

    for(int i=0; i<keyinput.length; i++) {
      if(keyinput[i].equals("right")) {
        if(answer[0] < x) answer[0]++;
      }
      else if(keyinput[i].equals("left")) {
        if(answer[0] > x*-1) answer[0]--;
      }
      else if(keyinput[i].equals("up")) {
        if(answer[1] < y) answer[1]++;
      }
      else if(keyinput[i].equals("down")) {
        if(answer[1] > y*-1) answer[1]--;
      }
    }

    return answer;
  }
}
