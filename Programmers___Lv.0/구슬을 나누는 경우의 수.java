// 풀이시간 35:33


class Solution {
  public int solution(int balls, int share) {
    
		int answer = 1;
    if(balls == share) return answer;
		
    BigInteger num1 = new BigInteger("1");
            
    for(int i=0; i<share; i++){
       BigInteger num2 = new BigInteger(Integer.toString(1 + i));
       BigInteger num3 = new BigInteger(Integer.toString(balls - i));
       num1 = num1.multiply(num3); 
       num1 = num1.divide(num2);
    }
    answer = num1.intValue();

    return answer;
  }
}
