function climbStairs(n){
    let prv1 = 1;
    let prv2 = 1;

    for (let i = 0; i < n; i++) {
        let tmp = prv1;
        prv1 = prv1 + prv2;
        prv2 = tmp;
    }

    return prv2;
}

function stairs(n){
        let array = [];
        array[1] = 1;
        array[2] = 2;
        for (let i = 3 ;i<= n ; i++){
            array[i] = array[i-1] + array[i-2];
        }
        return array[n];
    }


n=1; 
console.log(stairs(n));