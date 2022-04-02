// Given a string with lowercase letters only, if you are allowed to replace no more than k letters with any letter, find the length of the longest substring having the same letters after replacement.
// Time O(n), Space O(n)

import java.util.*;

class CharacterReplacement {
    public static int findLength(String str, int k) {
      int windowStart = 0, maxLength = 0, maxRepeatCount = 0;
      Map<Character, Integer> freqMap = new HashMap<>();
  
      for (int windowEnd = 0; windowEnd < str.length(); windowEnd++){
        char rightChar = str.charAt(windowEnd);
        freqMap.put(rightChar, freqMap.getOrDefault(rightChar, 0) + 1);
        maxRepeatCount = Math.max(maxRepeatCount, freqMap.get(rightChar));
  
        if (windowEnd - windowStart + 1 - maxRepeatCount > k){
          char leftChar = str.charAt(windowStart);
          freqMap.put(leftChar, freqMap.get(leftChar) - 1);
          windowStart++;
        }
  
        maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
      }
      return maxLength;
    }
  }