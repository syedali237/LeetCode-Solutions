function maxOnes(nums){
    var count = 0;
    var maxCount = 0;
    for (let num of nums){
        if (num !== 1){
            maxCount = Math.max(maxCount , count);
            count = 0;
        } else {
            count +=1 ;
        }
    }
    return Math.max(maxCount,count);
}

function max(nums){
    var count = 0;
    var maxCount = 0;
    for (let i = 0; i<nums.length; i++){
        if (nums[i] == 1){
            count +=1;
            maxCount = Math.max(maxCount,count);
        } else {
            count = 0 ;
        }
    }
    return maxCount;
}

nums = [1,1,0,1,1,1];
console.log(max(nums));