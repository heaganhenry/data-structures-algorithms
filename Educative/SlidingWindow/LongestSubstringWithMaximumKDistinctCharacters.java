// Given a string, find the length of the longest substring in it with no more than k distinct characters.
// Time O(n), Space O(k)

import java.util.*;

class LongestSubstringKDistinct {
  public static int findLength(String str, int k) {
    int windowStart = 0, maxLength = 0;
    Map<Character, Integer> charFreq = new HashMap<>();

    for (int windowEnd = 0; windowEnd < str.length(); windowEnd++){
      char rightChar = str.charAt(windowEnd);
      charFreq.put(rightChar, charFreq.getOrDefault(rightChar, 0) + 1);

      while (charFreq.size() > k){
        char leftChar = str.charAt(windowStart);
        charFreq.put(leftChar, charFreq.get(leftChar) - 1);
        if (charFreq.get(leftChar) == 0)
          charFreq.remove(leftChar);
        windowStart++; 
      }
      
      maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
    }
    return maxLength;
  }
}