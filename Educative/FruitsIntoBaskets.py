# A farm has a single row of fruit trees. Given two baskets, each of which can only hold one type of fruit, write a function to return the maximum number of fruits in both baskets.
# You will pick exactly one fruit from every tree until you cannot, i.e., you will stop when you have to pick from a third fruit type.
# # Time O(n), Space O(1)

def fruits_into_baskets(fruits):
  window_start, max_fruits = 0, 0
  fruit_freq = {}

  for window_end in range(len(fruits)):
    next_fruit = fruits[window_end]
    fruit_freq[next_fruit] = fruit_freq.get(next_fruit, 0) + 1

    while len(fruit_freq) > 2:
      last_fruit = fruits[window_start]
      fruit_freq[last_fruit] -= 1
      if fruit_freq[last_fruit] == 0:
        del fruit_freq[last_fruit]
      window_start += 1
    max_fruits = max(max_fruits, window_end-window_start + 1)
  return max_fruits