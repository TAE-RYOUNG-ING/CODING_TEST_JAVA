// 풀이시간 08:40


class Solution {
  public String solution(String cipher, int code) {

    String answer = "";
    String[] arr = cipher.split("");

    for(int i=code; i<=arr.length; i += code) {
        answer += arr[i-1];
    }

    return answer;
  }
}
