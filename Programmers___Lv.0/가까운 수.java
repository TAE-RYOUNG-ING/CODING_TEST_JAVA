// 풀이시간 25:12


class Solution {
  public int solution(int[] array, int n) {

    int min = 100;
    for(int i=0; i<array.length; i++) {
      if(min > Math.abs(array[i]-n)) {
          min = Math.abs(array[i]-n);
      }
    }

    List<Integer> list = new ArrayList<Integer>();
    for(int i=0; i<array.length; i++) {
      if((min == Math.abs(array[i]-n))) {
          list.add(array[i]);
      }
    }

    Collections.sort(list);
    return list.get(0);
  }
}
