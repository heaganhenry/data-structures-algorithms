// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise. Each letter can only be used once.
// Time O(n), Space O(n)

const canConstruct = function (ransomNote, magazine) {
    let letters = {};

    for (let l of magazine) {
        letters[l] = letters[l] + 1 || 1;
    }

    for (let l of ransomNote) {
        if (!letters[l]) return false;
        else letters[l]--;
    }

    return true;
};