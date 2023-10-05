
// 풀이시간 07:23


class Solution {
  public String solution(int n) {
      
    String answer = "";
    
    for(int i=0; i<n; i++){
        answer += (i%2 == 0)? "수":"박";
    }
    
    return answer;
  }
}


// Stream 사용 풀이법
// return IntStream.rangeClosed(1, n)
//                 .mapToObj(i -> i%2 != 0? "수":"박")
//                 .collect(Collectors.joining());
