function removeDuplicate(nums){
    const numsLength = nums.length;

    if (numsLength === 0){
        return 0;
    }
    let j=1 ;
    for (let i =0 ; i < numsLength -1 ;i++){
        if (nums[i] !== nums[i+1]){
            nums[j] = nums[i+1];
            j++;
        }
    }
    return j ;
};

// console.log(removeDuplicate([1,1,2]));

function acceptedCode(nums){
    let uniqueCursor = 1;

	// Loop through the array of number
	for (let i = 1; i < nums.length; i++) {
		// Find unique values
		if (nums[i] !== nums[i - 1]) {
			// Move unique values to follow the last unique value found
			nums[uniqueCursor] = nums[i];

			// Move the unique value cursor onward
			uniqueCursor++;
		}
	}

	//nums.length = uniqueCursor; // Chop the surplus values - not needed for LC submission
	return uniqueCursor;
}


// function duplicate(nums){
// if (nums.length === 0){
//     return 0;
// }
// let j =1;
// for (let i=0 ; i<nums.length ; i++){
//     if (nums[i] !== nums[j]){
//         nums[j] === nums[i]
//         j++;
//     }
// }
// console.log(nums);

// return j;
// };
// console.log(duplicate([1,1,2]));