
// 풀이시간 23:59


class Solution {
  public String[] solution(String[] strings, int n) {
      
    Arrays.sort(strings);
    Arrays.sort(strings, Comparator.comparing((s) -> s.substring(n, n+1)));
    return strings;
  }
}
