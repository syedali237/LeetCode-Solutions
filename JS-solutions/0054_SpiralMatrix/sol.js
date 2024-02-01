function spiralOrder(matrix) {
  var n = matrix.length;
  var m = matrix[0].length;
  var left = 0;
  var right = m - 1;
  var top = 0;
  var bottom = n - 1;
  let result = [];

  while (top <= bottom && left <= right) {
    //right
    for (let i = left; i <= right; i++) {
      result.push(matrix[top][i]);
    }
    top++;

    //bottom
    for (let i = top; i <= bottom; i++) {
      result.push(matrix[i][right]);
    }
    right--;

    //left
    if (top <= bottom) {
      for (let i = right; i >= left; i--) {
        result.push(matrix[bottom][i]);
      }
      bottom--;
    }

    //top
    if (left <= right) {
      for (let i = bottom; i >= top; i--) {
        result.push(matrix[i][left]);
      }
      left++;
    }
  }

  return result;
}

matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];

console.log(spiralOrder(matrix));
