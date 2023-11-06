// 풀이시간 14:40


class Solution {
  public int solution(int i, int j, int k) {

    int answer = 0;
    String str = "";

    for(int a=i; a<=j; a++) {
      str += a;
    }

    for(int b=0; b<str.length(); b++) {
      if(str.charAt(b) == k+'0') answer++;
    }

    return answer;
  }
}
