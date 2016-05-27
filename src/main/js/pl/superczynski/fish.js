// https://codility.com/programmers/task/fish/

function fish(A, B) {
  var N = A.length;
  var M = N;
  function eat(i) {
    B.splice(i, 1);
    A.splice(i, 1);
    N--;
    return false;
  }
  while (M > 0) {
    for (var i = 0; i < N; i++) {
      if (B[i] === 1 && B[i + 1] === 0) {
        if (A[i] > A[i + 1]) {
          eat(i + 1); //eat fish
        } else {
          eat(i); //being eaten
        }
      }
    }
    --M;
  }
  return N;
}

var A = [4, 3, 2, 1, 5];
var B = [0, 1, 0, 0, 0];
console.log(fish(A, B));