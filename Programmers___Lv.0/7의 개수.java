// 풀이시간 04:38


class Solution {
  public int solution(int[] array) {

    int answer = 0;
    String str = "";

    for(int i=0; i<array.length; i++){
      str += String.valueOf(array[i]);
    }

    for(String s : str.split("")) {
      if(s.equals("7")) answer++;
    }

    return answer;
  }
}
