// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transactions are done and the max profit = 0.


// runtime error
function maxProfit(prices){
    let output = [];
    for (let i = 0 ; i < prices.length ; i++){
        for (let j = prices.length-1 ; j > i ; j--){
            const value = prices[j] - prices[i];
            if(value >= 0){
            output.push(value);
            }
        }
    }
    if (output.length === 0){
        return 0; 
    }else {
    const maxNumber = Math.max(...output);
    console.log(output);
    return maxNumber;
    }
}

//time limit exceeded
function maxProf(prices){
    let maxValue = 0 ; 
    for (let i = 0 ; i < prices.length ; i++){
        for (let j = i + 1; j < prices.length; j++){
            let profit = prices[j] - prices[i];

            maxValue = Math.max(maxValue , profit);
        }
    }
    return maxValue;
}


//accepted
function timeLimit(prices){
    if (prices.length < 2) {
        return 0; // Not enough days to make a profit
    }

    let minValue = prices[0];
    let maxProfit = 0;

    for (let i = 1; i < prices.length; i++) {
        // Update the minimum value
        minValue = Math.min(minValue, prices[i]);

        // Update the maximum profit
        maxProfit = Math.max(maxProfit, prices[i] - minValue);
    }

    return maxProfit;
}

// prices = [7,1,5,3,6,4]
prices = [7,6,4,3,1]
console.log(timeLimit(prices));