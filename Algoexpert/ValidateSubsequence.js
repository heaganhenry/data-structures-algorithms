// # Given two non-empty arrays of integers, write a function that determines whether the second array is a subsequence of the first one.

function isValidSubsequence(array, sequence) {
    let idx = 0;
      
      for (const val of array){
          if (val === sequence[idx]) idx++;
          if (idx === sequence.length) break;
      }
      
      return idx === sequence.length;
  }