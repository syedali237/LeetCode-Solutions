// nums = [1,2,3,4,5,6,7], k = 3
// output = [5,6,7,1,2,3,4
//Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]

function rotateArray(nums, k){
    for (let j =1 ; j <= k ; j++){
        let lastElement = nums.pop();  // Remove the last element
        nums.unshift(lastElement); 
    }
    return nums;
}
// due to time limit exceed above is not perfomring
function accepted(nums,k){
    if (nums.length > k) {
        nums.unshift( ...nums.splice(-k) );
    } else {
        while(k--) {
            nums.unshift( nums.pop() );
        }
    }
    return nums
}
console.log((accepted([1,2,3,4,5,6,7], 3)));