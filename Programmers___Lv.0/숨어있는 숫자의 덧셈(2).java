// 풀이시간 21:05


class Solution {
  public int solution(String my_string) {

    String[] arr = my_string.split("[a-z|A-Z]");
		
    List<String> list = new ArrayList<>(Arrays.asList(arr));
    list.removeAll(Arrays.asList("", null));
		// list.removeIf(Objects::isNull);
		// list.removeIf(String::isEmpty);

    return list.stream()
               .map(i -> Integer.parseInt(i))
               .mapToInt(Integer::intValue)
               .sum();
  }
}
