// 풀이시간 12:02


// while문에 조건 설정
class Solution {
  public int solution(int hp) {

		int answer = 0;
	
		while(hp > 0) {
			if(hp >= 5) {
				answer ++;
				hp -= 5;
			}
			else if(hp >= 3) {
				answer ++;
				hp -= 3;
			}
			else {
				answer ++;
				hp -= 1;
			}
		}
	
	}
}


// 나머지와 몫 활용
// return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
