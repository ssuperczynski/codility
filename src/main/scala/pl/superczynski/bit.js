function bit(N) {
  return N.toString(2).replace(/^0+|0+$/g, "")
    .split(1)
    .map(function (f) {
      return f.length
    })
    .sort()
    .pop();
}

console.log(bit(1));
console.log(bit(2));
console.log(bit(3));
console.log(bit(334));
console.log(bit(52));