// You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day
// to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction.
// Time O(n), Space O(1)

object Solution {
    def maxProfit(prices: Array[Int]): Int =
        prices.foldLeft((Int.MaxValue, 0)) {
            case ((minPrice, maxProfit), price) => (minPrice.min(price), maxProfit.max(price - minPrice))
        }._2
}