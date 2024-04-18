function countNegativesTS(grid: number[][]): number {
  let count = 0;
  let n = grid[0].length;
  let currRowNegativeIndex = n - 1;
  for (let row of grid) {
    while (currRowNegativeIndex >= 0 && row[currRowNegativeIndex] < 0) {
      currRowNegativeIndex--;
    }
    count += n - (currRowNegativeIndex + 1);
  }
  return count;
}
