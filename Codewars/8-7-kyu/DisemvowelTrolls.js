// Trolls are attacking your comment section! Remove all of the vowels from the trolls' comments, neutralizing the threat.

function disemvowel(str) {
    const vowels = 'aeiou'
    return str.split('').filter(c => !vowels.includes(c.toLowerCase())).join('')
}