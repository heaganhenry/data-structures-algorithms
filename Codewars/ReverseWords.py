# Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

def reverse_words(text):
    output = []

    for i in text.split(' '):
        output.append(i[::-1])
    
    return ' '.join(output)