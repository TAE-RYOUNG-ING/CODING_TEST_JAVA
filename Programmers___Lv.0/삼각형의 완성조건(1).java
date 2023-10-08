
// 풀이시간 03:20


class Solution {
  public int solution(int[] sides) {
      
    Arrays.sort(sides);
    if(sides[0]+sides[1] > sides[2]) return 1;
    else return 2;
  
    // return sides[0]+sides[1] > sides[2]? 1 : 2;
  }
}


// return문에서 삼항연자를 사용하여 풀 경우 속도가 좀 더 느림
// if-else문이 조금 더 빠름
