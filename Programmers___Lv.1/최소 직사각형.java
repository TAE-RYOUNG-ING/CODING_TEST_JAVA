

// 풀이시간 28:43


class Solution {
  public int solution(int[][] sizes) {
  
    int tmpMax = 0, tmpMin = 0;
  
    for (int[] size: sizes) {
        int max = Math.max(size[0], size[1]);
        int min = Math.min(size[0], size[1]);
  
        tmpMax = Math.max(max, tmpMax);
        tmpMin = Math.max(min, tmpMin);
    }
  
    return tmpMax * tmpMin;
  }
}
