// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if: Open brackets must be closed by the same type of brackets. + Open brackets must be closed in the correct order.
// Time O(n), Space O(n)

const isValid = function(s) {
    const map = {')' : '(', '}' : '{', ']' : '['}
    const stack = []

    for (let i = 0; i < s.length; i++) {
        if (!map[s[i]]) {
            stack.push(s[i])
        } else {
            if (stack.length !== 0 && stack[stack.length - 1] === map[s[i]]) {
                stack.pop()
            } else {
                return false
            }
        }
    }

    return stack.length === 0
}