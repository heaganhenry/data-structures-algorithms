# 7kyu: Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

def reverse_words(text):
    result = []
    for chr in text.split(' '):
        result.append(chr[::-1])

    return ' '.join(result)