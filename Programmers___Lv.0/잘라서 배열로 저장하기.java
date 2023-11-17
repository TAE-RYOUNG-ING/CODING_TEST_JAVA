// 풀이시간 25:37


class Solution {
  public String[] solution(String my_str, int n) {

    // 배열의 길이 구하기
    int length = my_str.length() / n;
    if(my_str.length() % n != 0) length++;
    String[] answer = new String[length];

    // 배열 자르기
    int len = 0, i = 0;
    while(true) {
      if(len == my_str.length()) {
        break;
      }
      if(len+n > my_str.length()) {
        answer[i] = my_str.substring(len, my_str.length());
        break;
      }
      answer[i] = my_str.substring(len, len+n);
      len += n;
      i++;
    }

    return answer;
  }
}
