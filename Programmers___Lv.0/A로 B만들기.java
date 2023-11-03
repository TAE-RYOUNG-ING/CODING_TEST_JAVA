// 풀이시간 15:57


class Solution {
  public int solution(String before, String after) {

    int answer = 0;

    String[] bf = before.split("");
    String[] af = after.split("");
    Arrays.sort(bf);
    Arrays.sort(af);

    if(Arrays.equals(bf, af)) answer = 1;

    return answer;
  }
}
