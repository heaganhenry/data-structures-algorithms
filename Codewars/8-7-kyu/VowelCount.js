// Return the number of vowels in the given string ('a', 'e' , 'i', 'o', 'u' but not 'y').

function getCount(str) {
  return str.split('').filter(c => "aeiou".includes(c)).length
}