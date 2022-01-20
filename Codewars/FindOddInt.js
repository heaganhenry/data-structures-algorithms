// Given an array of integers, find the one that appears an odd number of times.
// There will always be only one integer that appears an odd number of times.

function findOdd(seq) {
    freq = {};

    for (num of seq)
        freq[num] ? freq[num]++ : freq[num] = 1;

    for (num in freq)
        if (freq[num] % 2 != 0)
        return Number(num);
}