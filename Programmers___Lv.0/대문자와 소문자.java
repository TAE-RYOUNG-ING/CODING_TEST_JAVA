// 풀이시간 04:20


class Solution {
  public String solution(String my_string) {
    
    String answer = "";
    
    for(int i =0; i<my_string.length(); i++){
      if(my_string.charAt(i) >= 'a'){
        answer += (char) (my_string.charAt(i)-32);
      }
      else answer += (char) (my_string.charAt(i)+32);
    }

    return answer;
  }
}
