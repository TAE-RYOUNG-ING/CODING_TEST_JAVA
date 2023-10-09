// 풀이시간 02:30


// 약수의 개수 활용
class Solution {
  public int solution(int n) {

    int answer = 0;
    for(int i=1; i<=n; i++) {
      if(n % i == 0) answer++;
    }

    return answer % 2 == 1 ? 1 : 2;
  }
}


// Math.sqrt() 사용
// if (n % Math.sqrt(n) == 0) return 1;
// else return 2;
