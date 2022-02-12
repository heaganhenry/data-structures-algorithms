// # Given two non-empty arrays of integers, write a function that determines whether the second array is a subsequence of the first one.

function isValidSubsequence(array, sequence) {
  let i = 0;
	let j = 0;
	
	while (i < array.length && j < sequence.length){
		if (array[i] === sequence[j]) j++;
		i++;
	}
	
	return j == sequence.length;
}