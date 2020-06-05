Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.


swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]


public int[] swapEnds(int[] nums) {
  int last = nums.length-1 ;
  int[] modifiedArray = new int[nums.length] ;
  for(int i = 0 ; i < nums.length ; i++)
    modifiedArray[i] = nums[i] ; 
    
  int temp = modifiedArray[0] ;
  modifiedArray[0] = modifiedArray[modifiedArray.length-1] ;
  modifiedArray[modifiedArray.length-1] = temp ;
  
  return modifiedArray ;
}
