function uniqueOccurence(arr){
    const countMap = {};
    arr.forEach(element => {
        if (countMap[element] === undefined){
            countMap[element] = 1;
        } else {
            countMap[element]++;
        }
    });
    console.log(countMap);
    var counts = Object.values(countMap).sort();
    console.log(counts);
    for (let i = 0 ;i < counts.length ; i++){
        for (let j = i+1 ; j<counts.length ; j++){
            if (counts[j] === counts[i]) {return false}
        }
    }
    return true;
}

arr = [1,2,2,1,1,3];
console.log(uniqueOccurence(arr));