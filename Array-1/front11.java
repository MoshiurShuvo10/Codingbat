
Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.


front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]


public int[] front11(int[] a, int[] b) {
  int newArray[] = new int[2] ;
  int new_Array[] = new int[1] ;
  int zeroArray[] = new int[0] ;
  if(a.length == 0 && b.length == 0)
    return zeroArray ; 
  if(a.length == 0)
  {
    new_Array[0] = b[0] ;
    return new_Array ;
  }
  else if(b.length == 0)
  {
    new_Array[0] = a[0] ;
    return new_Array ;
  }
  else
  {
    newArray[0] = a[0] ;
    newArray[1] = b[0] ;
    return newArray ; 
  }
}
