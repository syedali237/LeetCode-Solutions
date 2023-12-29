// input : [3,2,2,3] ; val =3 
//output : 2 ; [2,2]

function removeElem(nums ,val){
    let j = 0;
    for (let i = nums.length - 1 ; i >= 0 ; i--){
         // (i= 0 ; i < .length ; i++) does not work since when splice used the first 
         // 2 of the array gets removed but the consecutive one takes its place and gets skipped 
         // since i is incremented
        if (nums[i] == val ){
            nums.splice(i , 1);
        } else {
            j++;
        }
    }
    console.log(nums);
    return j;
}
console.log(removeElem([0,1,2,2,3,0,4,2] , 2));

// function removeElem(nums){
//     let j = 0;
//     let val = 2;
//     for (let i =0 ; i<nums.length ; i++){
//         if (nums[i] !== val ){
//             nums[j] = nums[i];
//             j++;
//     }
//     console.log(nums);
//     return j;
// }
// }
