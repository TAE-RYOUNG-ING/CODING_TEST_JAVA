// 풀이시간 04:32


class Solution {
  public String solution(String my_string) {

    String answer = "";
    
    char[] arr = my_string.toLowerCase().toCharArray();
    Arrays.sort(arr);
    for(char s : arr) answer += s;
    
    return answer;
  }
}
