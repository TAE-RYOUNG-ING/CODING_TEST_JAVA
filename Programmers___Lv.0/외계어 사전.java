// 풀이시간 15:46


class Solution {
  public int solution(String[] spell, String[] dic) {

    int answer = 2;

    for(String str : dic) {
      int cnt = 0;
      for(String s : spell) {
        if(str.contains(s)) cnt++;
      }
      if(cnt == spell.length) {
        answer = 1;
        break;
      }
    }

    return answer;
  }
}
