// Given a string and a list of words, find all the starting indices of substrings in the given string that are a concatenation of all the given words exactly once without any overlapping of words. 
// It is given that all words are of the same length.
// Time O(n * m * len) where n is the number of chars in the string, m is the number of words and len is the length of each word. Space O(m)

import java.util.*;

class WordConcatenation {
  public static List<Integer> findWordConcatenation(String str, String[] words) {
    Map<String, Integer> wordFreq = new HashMap<>();
    List<Integer> resultIndices = new ArrayList<Integer>();

    for (String word : words)
      wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);

    int wordCount = words.length;
    int wordLength = words[0].length();

    for (int i = 0; i < str.length() - (wordCount * wordLength) + 1; i++){
      Map<String, Integer> wordsSeen = new HashMap<>();
      for (int j = 0; j < wordCount; j++){
        int nextWordIndex = i + j * wordLength;
        String word = str.substring(nextWordIndex, nextWordIndex + wordLength);

        if (!wordFreq.containsKey(word))
          break;

        wordsSeen.put(word, wordsSeen.getOrDefault(word, 0) + 1);
        if (wordsSeen.get(word) > wordFreq.get(word))
          break;
        
        if (j + 1 == wordCount)
          resultIndices.add(i);
      }
    }

    return resultIndices;
  }
}