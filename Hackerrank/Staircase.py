# Write a program that prints a # staircase of size n.

def staircase(n):
    for i in range(n):
        for j in range(n - 1, i, -1):
            print(' ', end='')
        for k in range(0, i + 1):
            print('#', end='')
        
        print()