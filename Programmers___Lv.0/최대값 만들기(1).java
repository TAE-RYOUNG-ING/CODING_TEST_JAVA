
// 풀이시간 05:10


// 리스트의 역순 정렬
class Solution {
  public int solution(int[] numbers) {
      
    List<Integer> list = Arrays.stream(numbers)
		     				               .boxed()
			                         .collect(Collectors.toList());
    
    Collections.sort(list, Collections.reverseOrder());
      
    return list.get(0) * list.get(1); 
  }
}


// 배열의 순차 정렬
// Arrays.sort(numbers);
// return numbers[numbers.length-1] * numbers[numbers.length-2];
