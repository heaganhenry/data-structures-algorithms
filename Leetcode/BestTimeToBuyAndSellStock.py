# You are given an array prices where prices[i] is the price of a given stock on the ith day.
# You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
# Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

class Solution(object):
    def maxProfit(self, prices):
        max_profit = 0
        buy_idx, sell_idx = 0, 1
        
        while sell_idx < len(prices):
            if prices[buy_idx] < prices[sell_idx]:
                profit = prices[sell_idx] - prices[buy_idx]
                max_profit = max(max_profit, profit)
            else:
                buy_idx = sell_idx
            sell_idx += 1

        return max_profit