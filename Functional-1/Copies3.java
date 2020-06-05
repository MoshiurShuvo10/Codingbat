
Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.


copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
copies3(["24", "a", ""]) → ["242424", "aaa", ""]
copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]


public List<String> copies3(List<String> strings) {
  List<String> concatenated_list = new ArrayList<String>() ; 
  Iterator<String> iterator = strings.iterator() ; 
  while(iterator.hasNext())
  {
    String elements = iterator.next() ; 
    String concatenated_element = elements+elements+elements ; 
    concatenated_list.add(concatenated_element) ; 
  }
  return concatenated_list ; 
}
