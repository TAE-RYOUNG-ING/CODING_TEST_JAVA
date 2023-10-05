
// 풀이시간 21 : 06


class Solution {
  public List<Integer> solution(int[] numbers) {
      
    List<Integer> list = new ArrayList<Integer>();
    for(int i=0; i<numbers.length; i++) {
      for(int j=0; j<numbers.length; j++) {
        if(i != j) {
          list.add(numbers[i] + numbers[j]);
        }
      }
    }
      
    HashSet<Integer> hs = new HashSet<Integer>(list);
    list.clear();
    list.addAll(hs);
    Collections.sort(list);
        
    return list;
  }
}
