// input : nums = [2,0,2,1,1,0];
// output : [0,0,1,1,2,2];

function sortColors(nums){
    // return nums.sort(); most simple way in JS
    for (var i = 1; i < nums.length; i++){
        for (var j = 0; j < i; j++){
            if (nums[i] < nums[j]) {
            var x = nums[i];
            nums[i] = nums[j];
            nums[j] = x;}
        }
    }
    return nums;
}

nums = [2,0,2,1,1,0];

console.log(sortColors(nums));