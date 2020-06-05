
Given a list of strings, return a list where each string has "y" added at its start and end.


moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
moreY(["yay"]) → ["yyayy"]


public List<String> moreY(List<String> strings) {
  List<String> modified_list = new ArrayList<String>() ; 
  Iterator<String> iterator = strings.iterator() ; 
  while(iterator.hasNext())
  {
    String element = iterator.next() ; 
    String modified_element = "y"+element+"y" ; 
    modified_list.add(modified_element) ; 
  }
  return modified_list ; 
}
