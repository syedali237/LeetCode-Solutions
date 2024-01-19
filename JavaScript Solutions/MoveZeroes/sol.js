function moveZeroes(nums){
    for (let i = nums.length - 1; i >= 0; i--){
        if (nums[i] === 0){
            nums.splice(i,1);
            nums.push(0);
        }
    }
    return nums;
}

nums = [0,0,1];
console.log(moveZeroes(nums));
// nums = [0,1,0,3,12];