// 풀이시간 15:16


class Solution {
  public int solution(int[][] dots) {

    int xMax = dots[0][0], xMin = dots[0][0];
    for(int i=0; i<dots.length; i++) {
      if(xMax < dots[i][0]) xMax = dots[i][0];
      if(xMin > dots[i][0]) xMin = dots[i][0];
    }

    int yMax = dots[0][1], yMin = dots[0][1];
    for(int i=0; i<dots.length; i++) {
      if(yMax < dots[i][1]) yMax = dots[i][1];
      if(yMin > dots[i][1]) yMin = dots[i][1];
    }

    return (xMax - xMin) * (yMax - yMin);
  }
}
