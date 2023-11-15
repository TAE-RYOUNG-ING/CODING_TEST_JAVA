// 풀이시간 17:22


class Solution {
  public int[] solution(int n) {

    Set<Integer> nums = new LinkedHashSet<>();

    int i = 2;
    while (n != 0 && i <= n) {
      if (n % i == 0) {
        nums.add(i);
        n /= i;
      } 
			else i++;
    }

    return nums.stream().mapToInt(Integer::intValue).toArray();
  }
}
