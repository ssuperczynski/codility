//slow
function solution1(A, K) {
    var L = A.length,
        B = [];
    if (K === 0) {
        return A;
    }
    if (L === 0 || L === 1 || L > 100 || L < 0 || K > 100 || K < 0) {
        return A;
    }

    for (var i = 0; i < L; ++i) {
        if (i + K < L) {
            B[i + K] = A[i];
        } else {
            B[i + K - L] = A[i];
        }
    }

    return B;
}


// fast
function solution2(A, K) {
    while(A.length && K > 0) {
        A.unshift(A.pop());
        K--;
    }
    return A;
}

console.log(solution1([1,2,3,4,5,6,234,22], 3));
console.log(solution2([1,2,3,4,5,6,234,22], 3));