# Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
# Methods pop, top and getMin operations will always be called on non-empty stacks.

class MinStack(object):
    def __init__(self):
        self._stack = []
        self._min_stack = []

    def push(self, val):
        self._stack.append(val)
        val = min(val, self._min_stack[-1] if self._min_stack else val)
        self._min_stack.append(val)

    def pop(self):
        self._stack.pop()
        self._min_stack.pop()

    def top(self):
        return self._stack[-1]

    def getMin(self):
        return self._min_stack[-1]