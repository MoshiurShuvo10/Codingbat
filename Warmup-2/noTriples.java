Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.


noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false

public boolean noTriples(int[] nums) {
  boolean flag = true ; 
  for(int i = 0 ; i < nums.length-2 ; i++)
  {
    int current = nums[i] ;
    if(nums[i+1] == current && nums[i+2] == current)
      flag=false ; 
  }
  return flag ; 
}
