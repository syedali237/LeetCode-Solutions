// input == nums = [-1,0,1,2,-1,-4]
// output == [[-1,-1,2],[-1,0,1]]

function threeSum(nums){
    let result = [];
    for (var i = 1; i < nums.length; i++){
        for (var j = 0; j < i; j++){
            if (nums[i] < nums[j]) {
            var x = nums[i];
            nums[i] = nums[j];
            nums[j] = x;}
        }
    }
    console.log(nums);
    for (let i = 0 ; i < nums.length ; i++){
        for (let j = i+1 ; j < nums.length; j++){
        for (let k = j + 1; k < nums.length; k++) {
            if (nums[i] + nums[j] + nums[k] === 0){
                result.push([nums[i], nums[j], nums[k]]);
            }
        }   
        }
    }
    let array = [];
    result.forEach(subArray=> {
        const subArrayString = JSON.stringify(subArray);
        if (!array.includes(subArrayString)){
            array.push(subArrayString);
        }
    })
    const numberArrays = array.map(str => JSON.parse(str));

    return numberArrays;
}

console.log(threeSum([-1,0,1,2,-1,-4]));