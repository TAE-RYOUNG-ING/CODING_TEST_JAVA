// 풀이시간 05:20


class Solution {
  public int solution(int num, int k) {

    int answer = -1;
    String str = num + "";

    for(int i=0; i<str.length(); i++) {
      int chk = str.charAt(i) - '0';
      if(chk == k) {
          answer = i+1;
          break;
      }
    }

    return answer;
  }
}
