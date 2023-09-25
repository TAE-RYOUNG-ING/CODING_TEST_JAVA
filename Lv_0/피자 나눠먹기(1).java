
// 풀이시간 04:50


class Solution {
  public int solution(int n) {
  
    return n%7 == 0? n/7 : n/7 +1;
  }
}


// 정수론 활용
// 6은 '어떤 수를 7로 나누면 나머지가 0부터 6까지만 있어서 대입된 숫자
return (n+6) / 7;
