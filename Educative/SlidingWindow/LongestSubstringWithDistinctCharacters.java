// Given a string, find the length of the longest substring, which has all distinct characters.
// Time O(n), Space O(k) where k is the number of distinct characters in the string

import java.util.*;

class NoRepeatSubstring {
  public static int findLength(String str) {
    int windowStart = 0, maxLength = 0;
    Map<Character, Integer> indexMap = new HashMap<>();

    for (int windowEnd = 0; windowEnd < str.length(); windowEnd++){
      char rightChar = str.charAt(windowEnd);
      if (indexMap.containsKey(rightChar))
        windowStart = Math.max(windowStart, indexMap.get(rightChar) + 1);

      indexMap.put(rightChar, windowEnd);
      maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
    }
    return maxLength;
  }
}