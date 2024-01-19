function twoSumOneCaseNotDefined (nums , target){
    let output = [];
for (let i=0 ; i<nums.length ; i++){
    const value = nums[i] + nums[i+1];
    if (value === target){
        const firstValue = nums.indexOf(nums[i]);
        const secondValue = nums.indexOf(nums[i+1]);
        // console.log(firstValue,secondValue);
        output.push(firstValue);
        output.push(secondValue);
    }  
}
return output;
}