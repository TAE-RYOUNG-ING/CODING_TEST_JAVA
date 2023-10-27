// 풀이시간 05 : 23


class Solution {
  public int solution(int order) {

    int answer = 0, cnt = 0;

    while(order != 0) {
      if(order % 10 == 3 || order % 10 == 6 || order % 10 == 9) cnt++;
      else order = order / 10;
    }
    answer = cnt;

    return answer;
  }
}
