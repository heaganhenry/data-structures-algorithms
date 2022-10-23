// You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day
// to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction.
// Time O(n), Space O(1)

const maxProfit = function(prices) {
    let maxProfit = 0
    let minPrice = prices[0]

    for (let i = 1; i < prices.length; i++) {
        let curPrice = prices[i]
        minPrice = Math.min(minPrice, curPrice)
        maxProfit = Math.max(curPrice - minPrice, maxProfit)
    }

    return maxProfit
}