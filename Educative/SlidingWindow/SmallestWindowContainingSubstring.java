// Given a string and a pattern, find the smallest substring in the given string which has all the character occurrences of the given pattern.
// Time O(n), Space O(m) where m is the length of the pattern

import java.util.*;

class MinimumWindowSubstring {
  public static String findSubstring(String str, String pattern) {
    int windowStart = 0, substrStart = 0, matched = 0;
    int minLength = str.length() + 1;
    Map<Character, Integer> charFreq = new HashMap<>();

    for (char chr : pattern.toCharArray())
      charFreq.put(chr, charFreq.getOrDefault(chr, 0) + 1);
    
    for (int windowEnd = 0; windowEnd < str.length(); windowEnd++){
      char rightChar = str.charAt(windowEnd);
      if (charFreq.containsKey(rightChar)){
        charFreq.put(rightChar, charFreq.get(rightChar) - 1);
        if (charFreq.get(rightChar) >= 0)
          matched++;
      }

      while (matched == pattern.length()){
        if (minLength > windowEnd - windowStart + 1){
          minLength = windowEnd - windowStart + 1;
          substrStart = windowStart;
        }

        char leftChar = str.charAt(windowStart++);
        if (charFreq.containsKey(leftChar)){
          if (charFreq.get(leftChar) == 0)
            matched--;
          charFreq.put(leftChar, charFreq.get(leftChar) + 1);
        }
      }
    }

    return minLength > str.length() ? 
      "" : str.substring(substrStart, substrStart + minLength);
  }
}