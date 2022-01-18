# Write a function to find the longest common prefix string amongst an array of strings.
# If there is no common prefix, return an empty string "".

def longestCommonPrefix(self, strs):
        if len(strs) == 0:
            return ""
        if len(strs) == 1:
            return strs[0]
        
        prefix = strs[0]
        plen = len(prefix)
        
        for string in strs[1:]:
            while prefix != string[:plen]:
                prefix = prefix[:plen - 1]
                plen -= 1
                if plen == 0:
                    return ""
        
        return prefix