
// 풀이시간 30:27


class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {   
    
    String[] answer = new String[n];
    
    for(int i=0; i<arr1.length; i++) {
      String str = Integer.toString(arr1[i] | arr2[i], 2);
      str = str.replace("0", " ");
      str = str.replace("1", "#");
      
      if(str.length() != n) {
        String add = "";
        for(int j=0; j<n-str.length(); j++) {
          add += " ";
          str = add + str;
        }
      }
        answer[i] = str;
    }
  
    return answer;
  }
}
