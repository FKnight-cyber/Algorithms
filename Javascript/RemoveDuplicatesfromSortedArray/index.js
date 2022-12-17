/**
 * @param {number[]} nums
 * @return {number}
 */
 var removeDuplicates = function(nums) {
  if(nums.length === 0) return 0;
  let k = 1;

  for(let i = 0; i < nums.length; i++) {
      if(nums[i] !== nums[i+1]) {
          k++;
      }else {
          nums.splice(nums.indexOf(nums[i+1]),1);
          i--;
      }
  }

  return k;
};