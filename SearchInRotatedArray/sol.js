// nums = [4,5,6,7,0,1,2], target = 0

function search(nums,target){
    return nums.findIndex(v => v === target);
}

nums = [4,5,6,7,0,1,2]; 
target = 0;
console.log(search(nums,target));