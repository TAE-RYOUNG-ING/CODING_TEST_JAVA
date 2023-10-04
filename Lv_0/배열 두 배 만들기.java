
// 풀이시간 02:12

class Solution {
  public int[] solution(int[] numbers) {
    return Arrays.stream(numbers).map(i -> i * 2).toArray();
  }
}


// for문
// int[] answer = new int[numbers.length];
// for(int i=0; i<numbers.length; i++) {
//   numbers[i] *= 2;
// }
