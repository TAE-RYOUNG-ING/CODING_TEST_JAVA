
// 풀이시간 03:23


class Solution {
  public int solution(int[] array) {

    Arrays.sort(array);
    int answer = array[array.length / 2];
        
    return answer;
  }
}


// return문에 바로 array[array.length / 2]; 를 하는 것보다 
// 변수 answer에 값을 저장하고 answer을 return하는 것이 좀 더 빠름
