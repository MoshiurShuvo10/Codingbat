
Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).


lower(["Hello", "Hi"]) → ["hello", "hi"]
lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]



public List<String> lower(List<String> strings) {
  List<String> modified_list = new ArrayList<String>() ; 
  Iterator<String> iterator = strings.iterator() ; 
  while(iterator.hasNext())
  {
    String element = iterator.next() ; 
    String lowercase_element = element.toLowerCase() ; 
    modified_list.add(lowercase_element) ; 
  }
  return modified_list ; 
}
