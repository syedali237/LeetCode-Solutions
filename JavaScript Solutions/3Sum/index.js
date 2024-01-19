function threeSum(nums) {
    let result = [];
    // Sorting the array to make the check for duplicates easier
    nums.sort((a, b) => a - b);

    for (let i = 0; i < nums.length - 2; i++) {
        // Skip duplicate values for the first element of the triplet
        if (i > 0 && nums[i] === nums[i - 1]) {
            continue;
        }

        let left = i + 1;
        let right = nums.length - 1;

        while (left < right) {
            const sum = nums[i] + nums[left] + nums[right];

            if (sum === 0) {
                result.push([nums[i], nums[left], nums[right]]);

                // Skip duplicate values for the second element of the triplet
                while (left < right && nums[left] === nums[left + 1]) {
                    left++;
                }

                // Skip duplicate values for the third element of the triplet
                while (left < right && nums[right] === nums[right - 1]) {
                    right--;
                }

                left++;
                right--;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
    }

    return result;
}

console.log(threeSum([-1, 0, 1, 2, -1, -4])); // Output: [ [ -1, -1, 2 ], [ -1, 0, 1 ] ]