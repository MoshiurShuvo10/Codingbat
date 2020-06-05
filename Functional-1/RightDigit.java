
Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)


rightDigit([1, 22, 93]) → [1, 2, 3]
rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
rightDigit([10, 0]) → [0, 0]


public List<Integer> rightDigit(List<Integer> nums) {
  List<Integer> list = new ArrayList<Integer>() ; 
  Iterator<Integer> element = nums.iterator() ; 
  while(element.hasNext())
  {
    int single_element = element.next() ; 
    int last_digit = single_element % 10 ; 
    list.add(last_digit) ;
  }
  return list ;
}
