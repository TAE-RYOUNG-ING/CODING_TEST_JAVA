
// 풀이시간 46:15


class Solution {
  public int solution(int a, int b, int n) {

    int answer = 0;
    while(n/a > 0) {  // n >= a
      answer += (n/a) * b;
      n = (n/a)*b + n%a;
    }

    return answer;
  }
}
