// Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window.
// If there is no such substring, return the empty string "".
// Time O(m), Space O(n)

class Solution {
    public String minWindow(String s, String t) {
        int windowStart = 0, subStrStart = 0, matches = 0, minLength = s.length() + 1;
        Map<Character, Integer> charFreq = new HashMap<>();

        for (char chr : t.toCharArray())
          charFreq.put(chr, charFreq.getOrDefault(chr, 0) + 1);

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
          char rightChar = s.charAt(windowEnd);
          if (charFreq.containsKey(rightChar)) {
            charFreq.put(rightChar, charFreq.get(rightChar) - 1);
            if (charFreq.get(rightChar) >= 0)
              matches++;
          }

          while (matches == t.length()) {
            if (minLength > windowEnd - windowStart + 1) {
              minLength = windowEnd - windowStart + 1;
              subStrStart = windowStart;
            }

            char leftChar = s.charAt(windowStart++);
            if (charFreq.containsKey(leftChar)) {
              if (charFreq.get(leftChar) == 0)
                matches--;
              charFreq.put(leftChar, charFreq.get(leftChar) + 1);
            }
          }
        }

        return minLength > s.length() ? "" : s.substring(subStrStart, subStrStart + minLength);
    }
}
