// 풀이시간 05:32


// for문 사용
class Solution {
  public int[] solution(int n, int[] numlist) {

    int cnt = 0;
    for(int i=0; i<numlist.length; i++) {
        if(numlist[i] % n == 0) cnt++;
    }

    int[] answer = new int[cnt];
    for(int i=0, j=0; i<numlist.length; i++) {
        if(numlist[i] % n == 0) {
            answer[j] = numlist[i];
            j++;
        }
    }

    return answer;
  }
}


// Stream 사용
// return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
