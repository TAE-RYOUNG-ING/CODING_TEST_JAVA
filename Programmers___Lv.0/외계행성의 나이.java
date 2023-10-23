// 풀이시간 15:12

class Solution {
  public String solution(int age) {
      
	  String answer = "";

		// int배열로 변환
	  int[] arr = Stream.of(String.valueOf(age).split(""))
										  .mapToInt(Integer::parseInt)
										  .toArray();
    
    // 원소마다 97을 더한 값을 char타입 변환
    for(int i=0; i<arr.length; i++){
			answer += (char)(arr[i] + 97);
		}
      
    return answer;
  }
}
