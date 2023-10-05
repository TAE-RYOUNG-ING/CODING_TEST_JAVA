
// 풀이시간 35:43


class Solution {
  public String solution(String s, int n) {
  
    String answer = "";
  
    for(char ch : s.toCharArray()) {
        if(ch == ' ') {
            answer += ch;
        }
        else if(ch >= 'a' && ch <= 'z') {
            answer += (char)('a' + (ch-'a' +n) % 26);
        }
        else {
            answer += (char)('A' + (ch-'A' +n) % 26);
        }
    }
  
    return answer;
  }
}


// ch - ’a’ 는 a에서부터의 거리(기준점)이며, 그 거리에서 n만큼 멀어지게 됨
// 26으로 나누는 의미는 z, Z를 넘어갔을 때를 처리하기 위함
// a에 a에서부터 n만큼 멀어진 거리를 더함으로써 최종 값을 구함
