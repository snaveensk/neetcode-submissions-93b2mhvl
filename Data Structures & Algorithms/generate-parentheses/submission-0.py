class Solution:
    def generateParenthesis(self, n: int) -> List[str]:

        def dfs(l,r,s):
            if len(s) == 2*n:
                res.append(s)
                return
        
            if l<n:
                dfs(l+1,r,s+"(")
            
            if r<l:
                dfs(l,r+1,s+")")

        res=[]
        dfs(l=0,r=0,s="")
        return res
        