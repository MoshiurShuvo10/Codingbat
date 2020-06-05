
Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.


math1([1, 2, 3]) → [20, 30, 40]
math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
math1([10]) → [110]


public List<Integer> math1(List<Integer> nums) {
  List<Integer> numbers = new ArrayList<Integer>() ; 
  Iterator<Integer> iterator = nums.iterator() ; 
  while(iterator.hasNext())
  {
    int element = iterator.next() ; 
    int add_one = element+1 ; 
    int new_element = add_one*10 ; 
    numbers.add(new_element) ; 
  }
  return numbers ; 
}
