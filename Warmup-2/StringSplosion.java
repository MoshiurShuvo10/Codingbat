Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"


public String stringSplosion(String str) {
  String string = str.substring(0,1) ;
  for(int i = 2 ; i <= str.length() ; i++)
    string += str.substring(0,i) ;
  return string ; 
}

