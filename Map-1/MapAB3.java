
Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.


mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}


public Map<String, String> mapAB3(Map<String, String> map) {
    if(map.containsKey("a") && map.containsKey("b")) {
      String a_a = map.get("a") ;
      String b_b = map.get("b") ;
      map.put("a",a_a) ;
      map.put("b",b_b) ;
    }
   else  if(map.containsKey("a"))
      map.put("b",map.get("a")) ;
    else if(map.containsKey("b"))
      map.put("a",map.get("b")) ;
    return map ; 
}
