
// 풀이시간 04:36


class Solution {
  public int solution(int slice, int n) {
      
    int answer = 0;
    if(n%slice > 0) answer++;
    answer += n/slice;
  
    return answer;
  }
}


// 삼항연산자
// return n%slice > 0 ? n/slice+1 : n/slice;
