# Given a string and a list of words, find all the starting indices of substrings in the given string that are a concatenation of all the given words exactly once without any overlapping of words. 
# It is given that all words are of the same length.
# Time O(n * m * len) where n is the number of chars in the string, m is the number of words and len is the length of each word. Space O(m)

def find_word_concatenation(str1, words):
  if len(words) == 0 or len(words[0]) == 0:
    return []

  word_freq = {}
  for word in words:
    word_freq[word] = word_freq.get(word, 0) + 1

  result_indices = []
  word_count = len(words)
  word_length = len(words[0])

  for i in range((len(str1) - word_count * word_length) + 1):
    words_seen = {}
    for j in range(word_count):
      next_word_index = i + j * word_length
      word = str1[next_word_index:next_word_index + word_length]
      if word not in word_freq:
        break

      words_seen[word] = words_seen.get(word, 0) + 1
      if words_seen[word] > word_freq[word]:
        break
      
      if j + 1 == word_count:
        result_indices.append(i)
  
  return result_indices