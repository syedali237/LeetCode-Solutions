// Input: nums = [3,0,1]
// Output: 2
// Explanation: n = 3 since there are 3 numbers, so all numbers are in the 
// range [0,3]. 
// 2 is the missing number in the range since it does not appear in nums.

function missingNumber(nums) {
  for (var i = 0; i <= nums.length; i++) {
    // if (nums.findIndex(v => v == i) == -1)
    if (nums.indexOf(i) == -1) {
      return i;
    }
  }
}

var missingNum = function(nums) {
    const numSet = new Set(nums);

    for (let i = 0; i <= nums.length; i++) {
        if (!numSet.has(i)) {
            return i;
        }
    }
};

// nums = [0,1];
nums = [3,0,1];
// nums = [9,6,4,2,3,5,7,0,1];
console.log(missingNum(nums));