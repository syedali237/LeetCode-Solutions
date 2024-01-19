// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.

function median(nums1,nums2){
    var joinedArray = [...nums1, ...nums2];
    console.log(joinedArray);
    var length = joinedArray.length;
    for (var i = 1; i < length; i++){
        for (var j = 0; j < i; j++){
            if (joinedArray[i] < joinedArray[j]) {
            var x = joinedArray[i];
            joinedArray[i] = joinedArray[j];
            joinedArray[j] = x;}
        }
    }
    if (length%2 === 0){
       var mid1 = joinedArray[(length/2) - 1];
       var mid2 = joinedArray[length/2];
       return (mid1+mid2)/2;
    } else {
        return joinedArray[Math.floor(length/2)];
    }
    
}

nums1 = [1,3];
nums2 = [2];
console.log(median(nums1,nums2));