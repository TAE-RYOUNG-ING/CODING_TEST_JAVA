// 풀이시간 08:22


class Solution {
  public int solution(int[] sides) {

    int bigNum = Math.max(sides[0], sides[1]);
    int smallNum = Math.min(sides[0], sides[1]);

    return (bigNum + smallNum) - (bigNum - smallNum) - 1;
  }
}
