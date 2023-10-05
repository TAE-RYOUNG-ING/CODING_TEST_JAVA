
// 풀이시간 01:31


class Solution {
  public int solution(int[] array, int n) {

    return (int)Arrays.stream(array)
					            .filter(i -> i == n)
					            .count();
  }
}
