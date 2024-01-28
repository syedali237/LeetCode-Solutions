// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]

function intersection(nums1,nums2){
    const result = new Set();
    for (let i=0; i<nums1.length ; i++){
        for (let j=0 ; j<nums2.length ; j++){
            if(nums1[i] === nums2[j] && !result.has(nums1[i])){
                result.add(nums1[i]);
            }
        }
    }
    var output = Array.from(result);
    return output;
}

nums1 = [1,2,2,1];
nums2 = [2,2];
console.log(intersection(nums1,nums2));