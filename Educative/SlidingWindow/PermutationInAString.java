// Given a string and a pattern, find out if the string contains any permutation of the pattern.
// Time O(n), Space O(n)

import java.util.*;

class StringPermutation {
  public static boolean findPermutation(String str, String pattern) {
    int windowStart = 0, matches = 0;
    Map<Character, Integer> charFreq = new HashMap<>();

    for (char chr : pattern.toCharArray())
      charFreq.put(chr, charFreq.getOrDefault(chr, 0) + 1);
    
    for (int windowEnd = 0; windowEnd < str.length(); windowEnd++){
      char rightChar = str.charAt(windowEnd);
      if (charFreq.containsKey(rightChar)){
        charFreq.put(rightChar, charFreq.get(rightChar) - 1);
        if (charFreq.get(rightChar) == 0)
          matches++;
      }

      if (matches == charFreq.size())
        return true;

      if (windowEnd >= pattern.length() - 1){
        char leftChar = str.charAt(windowStart);
        if (charFreq.containsKey(leftChar)){
          if (charFreq.get(leftChar) == 0)
            matches--;
          charFreq.put(leftChar, charFreq.get(leftChar) + 1);
        }
        windowStart++;
      }
    }

    return false;
  }
}