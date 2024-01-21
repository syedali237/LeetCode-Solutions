var rob = function(nums) {
    let rob = 0;
    let norob = 0;
    for (let i = 0; i < nums.length; i++) {
        let newRob = norob + nums[i];
        let newNoRob = Math.max(norob, rob);
        rob = newRob;
        norob = newNoRob;
    }
    return Math.max(rob, norob);
};

// nums = [1,2,3,1];
// nums = [2,7,9,3,1];
// nums = [1,3,1];
nums = [2,1,1,2];
// nums = [1, 2];
console.log(rob(nums));