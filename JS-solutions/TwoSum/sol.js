// let num = [2,7,11,15];
// let target = 9;
// output = [0,1]

var twoSum = function(nums, target) {
    for (let i = 0; i < nums.length; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] === target) {
                return ([i,j]);
            }
        }
    }
};

function twoSum (nums, target) {
    let output = [];
    for (let i = 0; i < nums.length; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            const sum = nums[i] + nums[j];
            if (sum === target) {
                output.push(i, j);
                return output;
            }
        }
    }
}


