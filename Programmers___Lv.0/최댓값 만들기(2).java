// 풀이시간 05:22


class Solution {
  public int solution(int[] numbers) {
      
    Arrays.sort(numbers);
    
		// minusMax
		int num1 = numbers[0] * numbers[1];
		// plusMax
    int num2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];

    return num1 > num2 ? num1 : num2;
  }
}
