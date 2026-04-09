class Solution:
    def isValid(self, s: str) -> bool:
        map = {')':'(','}':'{',']':'['}
        stack =[]
        if not s:
            return False
        for i in s:
            if i in map and len(stack)>0:
                if stack[-1]== map.get(i):
                    stack.pop()
                else:
                    return False
            else:
                stack.append(i)
        print(str(stack))
        if  len(stack) == 0:
            return True
        return False        