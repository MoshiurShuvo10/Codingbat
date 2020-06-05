
Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.


makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]



public int[] makeEnds(int[] nums) {
  int newArray[] = new int[2] ; 
  int lastindex = nums.length - 1 ; 
  newArray[0] = nums[0] ; 
  newArray[1] = nums[lastindex] ; 
  return newArray ;
}