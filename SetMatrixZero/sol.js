// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]

function setZeroes(matrix) {
    let zeroPos = [];

    for (let i = 0 ;i<matrix.length ; i++){
        for (let j = 0 ; j < matrix[0].length ; j++){
            if (matrix[i][j] === 0){
                zeroPos.push([i,j]);
            }
        }
    }

    for (let i = 0 ; i<zeroPos.length; i++){
        var [row, col] = zeroPos[i];

        for (let i=0 ; i<matrix.length ; i++){
            matrix[i][col] = 0;
        }
        for (let i=0; i<matrix[0].length;i++){
            matrix[row][i] = 0;
        }
    }
    console.log(zeroPos);
    return matrix;
}

matrix = [
  [1, 1, 1],
  [1, 0, 1],
  [1, 1, 1],
];
console.log(setZeroes(matrix));