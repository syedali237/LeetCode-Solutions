function rearrange(nums){
    let i = 0, j = 1;
    let res = [];
  
    for(let num of nums){
        if(num > 0){
            res[i] =num;
            i += 2
        } else {
            res[j] = num;
            j += 2
        }
    }
  return res
}

function re(nums){
    let pos = [];
    let neg = [];
    let arr = [];

    for (let i of nums) {
        (i < 0) ? neg.push(i) : pos.push(i)
    }

    for (let i = 0; i < pos.length; i++) {
        arr.push(pos[i], neg[i])
    }

    return arr;
}

nums = [3,1,-2,-5,2,-4];
console.log(rearrange(nums));