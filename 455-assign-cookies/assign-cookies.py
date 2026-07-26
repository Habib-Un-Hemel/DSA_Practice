class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        child = 0
        cookie = 0

        s.sort()
        g.sort()

        while child < len(g) and cookie < len(s):
            
            if g[child] <= s[cookie]:
                child +=1
            
            cookie +=1
        return child 

        