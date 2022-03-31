// A farm has a single row of fruit trees. Given two baskets, each of which can only hold one type of fruit, write a function to return the maximum number of fruits in both baskets.
// You will pick exactly one fruit from every tree until you cannot, i.e., you will stop when you have to pick from a third fruit type.
// Time O(n), Space O(1) 

import java.util.*;

class MaxFruitCountOf2Types {
  public static int findLength(char[] arr) {
    int windowStart = 0, maxFruits = 0;
    Map<Character, Integer> fruitMap = new HashMap<>();

    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++){
      char rightFruit = arr[windowEnd];
      fruitMap.put(rightFruit, fruitMap.getOrDefault(rightFruit, 0) + 1);

        while (fruitMap.size() > 2){
          char leftFruit = arr[windowStart];
          fruitMap.put(leftFruit, fruitMap.get(leftFruit) - 1);
          if (fruitMap.get(leftFruit) == 0)
            fruitMap.remove(leftFruit);
          windowStart++;
        }

      maxFruits = Math.max(maxFruits, windowEnd - windowStart + 1);
    }
    return maxFruits;
  }
}