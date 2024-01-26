// function sortedArray(nums1,nums2){
//     var array1 = nums1.filter(v=> v != 0 );
//     var array2 = nums2.filter(v=> v != 0 );
//     var result = (array1.concat(array2)).sort();
//     return result;
// }

function sortedArray(nums1,m,nums2,n){
    for (let i = m, j = 0; j < n; i++, j++) {
        nums1[i] = nums2[j];
    }
    nums1.sort((a, b) => a - b); 
    // nums1.sort();
}

nums1 = [1, 2, 3, 0, 0, 0];
m = 3;
n =3;
nums2 = [2, 5, 6];

// [1,2,2,3,5,6]
console.log(sortedArray(nums1,nums2));