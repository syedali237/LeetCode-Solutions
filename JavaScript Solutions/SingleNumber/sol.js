// Input: nums = [4,1,2,1,2]
// Output: 4

function singleNumber(nums){
    const seen = [];
    nums.forEach((element) => {
      const index = seen.indexOf(element);
      if (index !== -1) {
        seen.splice(index, 1);
      } else {
        seen.push(element);
      }
    });
    return seen[0];
}
nums = [2,2,1]

console.log(singleNumber(nums));