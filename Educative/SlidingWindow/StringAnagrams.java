// Given a string and a pattern, find all anagrams of the pattern in the given string and return a list of starting indices of the anagrams in the given string.
// Time O(n), Space O(n)

import java.util.*;

class StringAnagrams {
  public static List<Integer> findStringAnagrams(String str, String pattern) {
    int windowStart = 0, matches = 0;
    Map<Character, Integer> freqMap = new HashMap<>();
    List<Integer> indices = new ArrayList<Integer>();

    for (char chr : pattern.toCharArray())
      freqMap.put(chr, freqMap.getOrDefault(chr, 0) + 1);
    
    for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
      char rightChar = str.charAt(windowEnd);
      if (freqMap.containsKey(rightChar)) {
        freqMap.put(rightChar, freqMap.get(rightChar) - 1);
        if (freqMap.get(rightChar) == 0)
          matches++;
      }

      if (matches == freqMap.size())
        indices.add(windowStart);
      
      if (windowEnd >= pattern.length() - 1) {
        char leftChar = str.charAt(windowStart);
        if (freqMap.containsKey(leftChar)) {
          if (freqMap.get(leftChar) == 0)
            matches--;
          freqMap.put(leftChar, freqMap.get(leftChar) + 1);
        }
        windowStart++;
      }
    }

    return indices;
  }
}