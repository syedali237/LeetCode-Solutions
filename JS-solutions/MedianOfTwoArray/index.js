// reduced runtime
var findMedianSortedArrays = function (nums1, nums2) {
    // Merge two sorted arrays
    const mergedArray = merge(nums1, nums2);

    const length = mergedArray.length;

    if (length % 2 === 0) {
        // If the array has an even number of elements, find the average of the middle two elements
        const mid1 = mergedArray[length / 2 - 1];
        const mid2 = mergedArray[length / 2];
        return (mid1 + mid2) / 2;
    } else {
        // If the array has an odd number of elements, return the middle element
        return mergedArray[Math.floor(length / 2)];
    }
};

// Merge two sorted arrays using the merge sort algorithm
function merge(arr1, arr2) {
    let merged = [];
    let i = 0;
    let j = 0;

    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] < arr2[j]) {
            merged.push(arr1[i]);
            i++;
        } else {
            merged.push(arr2[j]);
            j++;
        }
    }

    // Add remaining elements from arr1 and arr2
    merged = merged.concat(arr1.slice(i), arr2.slice(j));

    return merged;
};