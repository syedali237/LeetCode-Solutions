// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000

// Input: s = "MCMXCIV"
// Output: 1994
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

// Input: s = "III"
// Output: 3
// Explanation: III = 3.

var value = {
  I: 1,
  V: 5,
  X: 10,
  L: 50,
  C: 100,
  D: 500,
  M: 1000,
};

function RomanToInt(s){
    let result = 0;
    for (var i=0 ; i<s.length ; i++){
        var currentSymbol = value[s[i]];
        var nextSymbol = value[s[i+1]];
        if (nextSymbol>currentSymbol){
            result -= currentSymbol;
        } else {
            result += currentSymbol;
        }
    }
    return result;
}

s = "MCMXCIV"
// s = "III";
console.log(RomanToInt(s));