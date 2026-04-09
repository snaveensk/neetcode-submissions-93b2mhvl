import sys
class Solution:
    def findMin(self, nums: List[int]) -> int:
        mini=sys.maxsize
        count =0
        for  i,a in enumerate(nums):
            if i>0:
                if mini>a:
                    mini=a
                if nums[i]< nums[i-1]:
                    return a
                count+=1
            else:
                count+=1
                mini=a
            if count ==len(nums):
                return nums[0]    