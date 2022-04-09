# You are given a string s and an array of strings words of the same length. 
# Return all starting indices of substring(s) in s that is a concatenation of each word in words exactly once, in any order, and without any intervening characters.
# Time O(n * m * len) Space O(m), where n is the number of chars in the string, m is the number of words and len is the length of each word. 

class Solution:
    def findSubstring(self, s: str, words: List[str]) -> List[int]:
        result_indices = []
        word_freq = {}
        
        for word in words:
            word_freq[word] = word_freq.get(word, 0) + 1
        
        word_count = len(words)
        word_length = len(words[0])
        
        # number of times concatenation of words can fit in s
        for i in range((len(s) - word_count * word_length) + 1):
            words_seen = {}
            # number of concatenated words we need to find
            for j in range(word_count):
                next_word_index = i + j * word_length
                word = s[next_word_index:next_word_index + word_length]
                
                # we are not concerned with these words
                if word not in word_freq:
                    break
                
                # word is repeated more times than required
                words_seen[word] = words_seen.get(word, 0) + 1
                if words_seen[word] > word_freq[word]:
                    break
                
                # all words found
                if j + 1 == word_count:
                    result_indices.append(i)
                    
        return result_indices