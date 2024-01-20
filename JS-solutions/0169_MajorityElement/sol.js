function majorityEl(nums){
    nums.sort();
    var n = nums.length;
    console.log(n);
    return nums[Math.floor(n/2)];
}

nums = [3,2,3];
console.log(majorityEl(nums));