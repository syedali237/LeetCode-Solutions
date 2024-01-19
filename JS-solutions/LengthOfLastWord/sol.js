// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.

// Input: s = "   fly me   to   the moon  "
// Output: 4
// Explanation: The last word is "moon" with length 4.

function length(s){
    var array = s.split(' ');
    console.log(array);
    for (var i = array.length-1; i>=0 ; i--){
        if (array[i] !== ''){
            return array[i].length;
        }
    }
}

function last(s){
    var array = s.split(' ').reverse();
    var lastWord = array.find(el => el !== '');
    return lastWord.length;
}

s = "   fly me   to   the moon  "
// s = "Hello World";
console.log(last(s));