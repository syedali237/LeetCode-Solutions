// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.

function index(haystack , needle){
    const value = haystack.indexOf(needle);
    if (value !== -1){
        return value;
    } else {
        return -1;
    }
}

console.log(index("hello" , "ll"));