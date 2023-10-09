// 풀이시간 03:13


class Solution {
  public int solution(int n, int t) {

    return n * (int) Math.pow(2, t);
  }
}


// for문 & 누적곱
// int answer = n;
// for(int i=1; i<=t; i++) n *= 2;
// return answer;
