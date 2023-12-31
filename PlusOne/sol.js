// input = [1,2,3]
// 123 + 1 = 124 ; output = [1,2,4]

function plusOne(nums){
    const value = nums.join('');
    const j = BigInt(value) + 1n;
    const i =  j.toString().split('').map(Number);
    console.log(value);
    return i;
}

nums = [6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3];
console.log(plusOne(nums));