
// 풀이시간 10:54


class Solution {
  public String solution(String my_string) {
      
    String answer = "";
    char[] arr = my_string.toCharArray();
    
    for(int i=0, j=0; i<arr.length; i++) {			
      answer += arr[arr.length-1 -i];
    }
  
    return answer;
  }
}


// StringBuilder 사용
// return new StringBuilder(myString).reverse().toString();
