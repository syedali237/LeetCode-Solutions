function firstUniq(str){
    // Create an object to store character frequencies
    const charCount = {};

    // Iterate through the string to populate the frequency counter
    for (const char of str) {
        charCount[char] = (charCount[char] || 0) + 1;
    }

    // Iterate through the string again to find the first unique character
    for (const char of str) {
        if (charCount[char] === 1) {
            var index = str.indexOf(char);
            return index;
        }
    }

    // If no unique character is found, return null or a default value
    return -1;
}

s = "loveleetcode";
console.log(firstUniq(s));