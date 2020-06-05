
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true

boolean doubleX(String str) {
 int index = str.indexOf('x') ;
 if(index == -1) return false ; 
 String string = str.substring(index) ;
return  (string.startsWith("xx")) ;
}
