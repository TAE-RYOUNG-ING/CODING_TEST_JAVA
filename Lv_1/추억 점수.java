
// 풀이시간 32:15


class Solution {
  public int[] solution(String[] name, int[] yearning, String[][] photo) {
      
    int[] answer = new int[photo.length];
      
    for(int i=0; i<photo.length; i++) {
      for(int j=0; j<photo[i].length; j++) {
        for(int k=0; k<name.length; k++) {
          if(photo[i][j].equals(name[k])) answer[i] += yearning[k];
        }
      }
    }
  
    return answer;
  }
}


// 단순 배열보단 map을 활용했을 때 속도가 빠름
// 케이스가 짧은 건 몰라도 길면 길수록 실행속도 차이가 큼
