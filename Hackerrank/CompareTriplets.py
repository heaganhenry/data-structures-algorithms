# Given a and b, determine their respective comparison points.
# If a[i] > b[i], then Alice is awarded 1 point. If a[i] < b[i], then Bob is awarded 1 point. If a[i] = b[i], then neither person receives a point.

def compareTriplets(a, b):
    alice = 0
    bob = 0
    
    for i in range (len(a)):
        if a[i] > b[i]:
            alice += 1
        elif b[i] > a[i]:
            bob += 1
    
    return [alice, bob]