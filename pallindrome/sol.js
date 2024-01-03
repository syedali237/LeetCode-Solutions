// input = 121
// output = pallindrom return ture else false

function pallindromeNumber(x){
    const nums = x.toString().split('').map(Number);
    console.log(nums);
    let j = nums.length - 1
    for (let i = 0; i < nums.length / 2; i++) {
        if (nums[i] != nums[j]) {
            return false;
        }
        j--;
    }
    return true;
}

console.log(pallindromeNumber(1000021));