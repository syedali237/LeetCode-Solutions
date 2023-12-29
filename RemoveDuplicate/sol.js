// nums = [1,1,2]
// output : 2; [1,2,_]

function removeDuplicate(nums){
    if (nums.length === 0){
        return 0;
    }
    let array = [];
    for (let i=0 ; i<nums.length ; i++){
        if (nums[i] !== nums[i+1]){
            array.push(nums[i]);
        }
        if (nums[i+1] === undefined){
            array.push(nums[i]);
        }
    }
    console.log(array);
    const k= array.length;
    return k;
}

console.log(removeDuplicate([1,1,2]));

// var removeDuplicates = function(nums) {
//     let array = [];
//     for (let i=0 ; i<nums.length ; i++){
//         if (nums[i] !== nums[i+1]){
//             array.push(nums[i]);
//             }
//     }
//     // const k = array.length;
//     return array;
// };

// console.log(removeDuplicates([1,1,2]));