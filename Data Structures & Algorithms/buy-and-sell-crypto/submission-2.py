
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l= 0
        r= 1
        maxi = 0
        while r<len(prices):
            res = (prices[r]-prices[l])
            if res<0:
                l=r
            r+=1
            maxi = max(res,maxi)
        return maxi