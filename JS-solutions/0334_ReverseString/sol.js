function reverse(s){
  var length = Math.floor((s.length)/2);
  let j = s.length-1;
  for (let i = 0; i<length ; i++){
    let temp = s[i];
    s[i] = s[j];
    s[j]=temp;
    j--;
  }
  return s;
}

s = ["h","e","l","l","o"];
console.log(reverse(s));