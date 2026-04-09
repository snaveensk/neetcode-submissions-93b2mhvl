class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        map ={}
        for i in range(len(numbers)):
            temp = target - numbers[i]
            if temp in map:
                return [map[temp],i+1]
            else:
                map[numbers[i]]=i+1
        
        