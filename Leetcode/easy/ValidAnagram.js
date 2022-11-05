// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// Time O(n), Space O(n)

const isAnagram = function (s, t) {
    if (s.length !== t.length) return false;

    const counts = {};
    for (let c of s) {
        counts[c] = (counts[c] || 0) + 1;
    }

    for (let c of t) {
        if (counts[c]) counts[c]--;
        else return false;
    }

    return true;
};