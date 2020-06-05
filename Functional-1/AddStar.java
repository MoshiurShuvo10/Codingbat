
Given a list of strings, return a list where each string has "*" added at its end.


addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
addStar(["hello", "there"]) → ["hello*", "there*"]
addStar(["*"]) → ["**"]



public List<String> addStar(List<String> strings) {
  List<String> modified = new ArrayList<String>() ; 
  Iterator<String> iterator = strings.iterator() ; 
  while(iterator.hasNext())
  {
    String element = iterator.next() ; 
    String addedStar = element+"*" ; 
    modified.add(addedStar) ; 
  }
  return modified ; 
}
