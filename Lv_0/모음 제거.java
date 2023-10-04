
// 풀이시간 10:21

class Solution {
  public String solution(String my_string) {
  
    String[] vowels = {"a", "e", "i", "o", "u"};
  
    for(String vowel : vowels){
      if(my_string.contains(vowel)){
        my_string = my_string.replace(vowel, "");
      }
    }
  
    return my_string;
  }
}


// 정규 표현식
// return my_string.replaceAll("[aeiou]", "");
// return myString.replaceAll("a|e|i|o|u", "");
