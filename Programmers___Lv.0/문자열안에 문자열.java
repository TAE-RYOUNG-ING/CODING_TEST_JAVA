
// 풀이시간 02 : 12


class Solution {
  public int solution(String str1, String str2) {

    return (str1.contains(str2)? 1: 2);
  }
}


// 반복문 안에 조건으로 판별하는 것보다 return문에 삼항연산자를 사용한 풀이가 빠름
