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

function pallindrome(x){
    let temp = x;
    let rev = 0;

    while(temp>0){
        var rem = temp%10;
        rev = rev*10 + rem;
        temp = Math.floor(temp/10);
    }
    return rev == x;
}

console.log(pallindrome(121));