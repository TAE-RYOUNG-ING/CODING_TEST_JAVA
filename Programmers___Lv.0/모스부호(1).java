// 풀이시간 20:11


class Solution {
  public String solution(String letter) {

    String[] morse = {".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..","--","-.",
            "---",".--.","--.-",".-.","...","-","..-","...-",
            ".--","-..-","-.--","--.."};
    String[] arr = letter.split(" ");

    StringBuilder sb = new StringBuilder();
    for(String s : arr) {
      for(int i=0; i < morse.length; i++) {
        if (s.equals(morse[i])) 
            sb.append(Character.toString(i + 'a'));
      }
    }

    return sb.toString();
  }
}
