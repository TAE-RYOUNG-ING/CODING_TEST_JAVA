// 풀이시간 15:45


class Solution {
  public int[] solution(int[] numbers, String direction) {
    
    int[] answer = new int[numbers.length];

    if(direction.equals("right")) {
      for(int i=0, j=1; i<numbers.length; i++) {
        if(i == numbers.length-1) 
          answer[0] = numbers[i];
        else
          answer[j] = numbers[i];
          j++;
      }
    }

    if(direction.equals("left")) {
      for(int i=0, j=1; i<numbers.length; i++) {
        if(i == 0)
          answer[numbers.length-1] = numbers[i];
        else
          answer[j-1] = numbers[i];
          j++;
      }
    }

    return answer;
  }
}
