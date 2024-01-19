// input = [1,2,3]
// 123 + 1 = 124 ; output = [1,2,4]

function plusOne(nums){
    const value = nums.join('');
    const j = BigInt(value) + 1n;
    const i =  j.toString().split('').map(Number);
    console.log(value);
    return i;
}

function logic(digits){
    var i = digits.length - 1;  // Initialize i to the last index of the array
  var val = 0;                // Initialize val to 0
  var carry = 1;              // Initialize carry to 1 (since we want to add 1)
  
  while (i >= 0 && carry) {
    val = digits[i] + carry;   // Add the current digit and carry
    carry = Math.floor(val / 10);  // Update carry by dividing val by 10 and rounding down
    digits[i] = val % 10;       // Update the current digit with the remainder of val divided by 10
    i--;                      // Move to the next digit (from right to left)
  }
  
  if (carry) {
    digits.unshift(carry);    // If there's still a carry after the loop, add it to the beginning of the array
  }
  
  return digits;              // Return the modified array
}

// digits =[1,2,3];
digits = [6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3];
console.log(logic(digits));

// console.log(plusOne(nums));