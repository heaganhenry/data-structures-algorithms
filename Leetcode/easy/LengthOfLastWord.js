// Given a string s consisting of words and spaces, return the length of the last word in the string.
// Time O(n), Space O(n)

const lengthOfLastWord = function(s) {
    const words = s.trim().split(' ')
    return words[words.length - 1].length
}