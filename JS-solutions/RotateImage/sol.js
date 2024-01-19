function rotate(matrix) {
    // transpose it
  var n = matrix.length;
  for (let i = 0; i < n-1; i++) {
    for (let j = i+1; j < n; j++) {
        let temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
  }


  // reverse the subarrays
  for (let i=0 ; i<n ; i++){
    matrix[i].reverse();
  }
console.log(matrix);




  return matrix;
}


m = [
  [1, 4, 7],
  [2, 5, 8],
  [3, 6, 9],
];

matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];

// matrix = [
//   [5, 1, 9, 11],
//   [2, 4, 8, 10],
//   [13, 3, 6, 7],
//   [15, 14, 12, 16],
// ];
console.log(rotate(matrix));
