// https://codility.com/programmers/task/frog_jmp/

function frog_jump(X, Y, D) {
  return Math.ceil((Y - X) / D);
}


console.log(frog_jump(10, 85, 30));