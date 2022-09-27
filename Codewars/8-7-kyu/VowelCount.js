// Return the number of vowels in the given string ('a', 'e' , 'i', 'o', 'u' but not 'y').

function getCount(str) {
    const vowels = "aeiou";
    let count = 0;

    for (chr of str) {
      if (vowels.includes(chr))
        count++;
    }

    return count;
}