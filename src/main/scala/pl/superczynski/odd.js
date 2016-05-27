// https://codility.com/programmers/task/odd_occurrences_in_array/

function main() {
  var A = [9, 3, 9, 3, 9, 7, 9];
  var B = [];
  A.map(function (x) {
    if (x in B) {
      B[x]++;
    } else {
      B[x] = 1;
    }
  });
  var ret;
  B.filter(function (x) {
    if (x % 2 !== 0) {
      ret = B.indexOf(x);
    }
  });

  return ret;
}

console.log(main());