
// 풀이시간 01:22


class Solution {
  public int[] solution(int money) {
    int[] answer = new int[2];

    answer[0] = money / 5500;
    answer[1] = money % 5500;

    return answer;
  }
}


// return new int[] { money / 5500, money % 5500 };
