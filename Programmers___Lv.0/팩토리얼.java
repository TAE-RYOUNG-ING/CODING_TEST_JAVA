// 풀이시간 17:12


class Solution {
  public int solution(int n) {

    int sum = 1, fac = 1; 

    while(sum <= n) {
        sum *= ++fac; // (2,2) (6,3) (24,4) 
    }

    return fac-1;
  }
}
