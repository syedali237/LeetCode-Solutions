function setZeroes(matrix) {
    var rows = matrix.length;
    var cols = matrix[0].length;
  
    // Use first row and first column as markers
    let firstRowHasZero = false;
    let firstColHasZero = false;
  
    // Check if the first row contains zero
    for (let j = 0; j < cols; j++) {
      if (matrix[0][j] === 0) {
        firstRowHasZero = true;
        break;
      }
    }
  
    // Check if the first column contains zero
    for (let i = 0; i < rows; i++) {
      if (matrix[i][0] === 0) {
        firstColHasZero = true;
        break;
      }
    }
  
    // Use the first row and column to mark other rows and columns
    for (let i = 1; i < rows; i++) {
      for (let j = 1; j < cols; j++) {
        if (matrix[i][j] === 0) {
          matrix[i][0] = 0;
          matrix[0][j] = 0;
        }
      }
    }
  
    // Set zeros based on the markers in the first row and column
    for (let i = 1; i < rows; i++) {
      for (let j = 1; j < cols; j++) {
        if (matrix[i][0] === 0 || matrix[0][j] === 0) {
          matrix[i][j] = 0;
        }
      }
    }
  
    // Set zeros for the first row and column if needed
    if (firstRowHasZero) {
      for (let j = 0; j < cols; j++) {
        matrix[0][j] = 0;
      }
    }
  
    if (firstColHasZero) {
      for (let i = 0; i < rows; i++) {
        matrix[i][0] = 0;
      }
    }
    return matrix;
  }

  matrix = [
    [1, 1, 1],
    [1, 0, 1],
    [1, 1, 1],
  ];
  console.log(setZeroes(matrix));