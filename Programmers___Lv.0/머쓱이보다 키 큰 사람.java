
// 풀이시간 01:25


class Solution {
  public int solution(int[] array, int height) {
    int answer = 0;
    for(int i: array){
        answer += (i > height)? 1 : 0;
    }
    return answer;
  }
}


// Stream 사용
// 		return (int) Arrays.stream(array).filter(value -> value > height).count();
