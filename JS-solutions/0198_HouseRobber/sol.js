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

nums = [1,2,3,1];
// nums = [2,7,9,3,1];
// nums = [1,3,1];
// nums = [2,1,1,2];
// nums = [1, 2];

function rob2(nums){
    if (nums.length < 2){
        return nums[0];
    }
    let output = [];
    output[0] = nums[0];
    output[1] = Math.max(nums[0], nums[1]);

    for (let i=2;i < nums.length; i++){
        output.push(Math.max(output[i-2] + nums[i], output[i-1]));
    }
    console.log(output);
    return output[output.length-1];
}
console.log(rob2(nums));