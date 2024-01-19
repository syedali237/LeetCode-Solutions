// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]

function searchRange(nums , target){
    let output = [];
    for (let i = 0 ; i < nums.length ; i++){
        if (nums[i] === target){
            output.push(i); // can use indexOf also
            break;
        }
    }
    for (let j = nums.length-1 ; j >= 0 ; j--){
        if (nums[j] === target){
            output.push(j);
            break;
        }
    }
    if (output.length === 0){
        return [-1,-1];
    }
    return output;
}

nums = [5, 7, 7, 8, 8, 10];
target = 8;
console.log(searchRange(nums,target));