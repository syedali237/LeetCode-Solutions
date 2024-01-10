// Input: strs = ["flower","flow","flight"]
// Output: "fl"

function longestCommonPrefix(strs){
    let commonPrefix = strs[0];

    for (let i = 1; i < strs.length; i++) {
      var currentString = strs[i];

      let j = 0;
      while (j < commonPrefix.length && 
        j < currentString.length &&
         commonPrefix[j] === currentString[j]) {
        j++;
      }
  
      commonPrefix = commonPrefix.slice(0, j);
  
      if (commonPrefix === '') {
        break;
      }
    }
  
    return commonPrefix;
}

strs = ["flower","flow","flight"];
console.log(longestCommonPrefix(strs));