// 풀이시간 42:17


class Solution {
  public int[] solution(int[] answers) {
      
    int[][] arr = {{1, 2, 3, 4, 5},
                   {2, 1, 2, 3, 2, 4, 2, 5},
                   {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
                  };

    // 사람 별 정답 수 계산
    int[] ea = new int[3];
    for(int i=0; i<ea.length; i++) 
      for(int j=0; j<answers.length; j++) 
        if(arr[i][j % arr[i].length] == answers[j]) 
            ea[i]++;

    // max값 찾기
    int max = Math.max(ea[0], Math.max(ea[1], ea[2]));
    
    // max값과 동일한 값을 가진 사람
    List<Integer> list = new ArrayList<>();
    for(int i=0; i<ea.length; i++)
      if(max == ea[i])
          list.add(i + 1);

    // 배열 변환
    int[] answer = new int[list.size()];
    int cnt = 0;
    for(int num : list)
      answer[cnt++] = num;
    
    return answer;
  }
}
