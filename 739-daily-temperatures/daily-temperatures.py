class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        answer = [0]* len(temperatures)

        stack = []

        for i in range(len(temperatures)):
            
            while len(stack) > 0 and temperatures[i] > temperatures[stack[-1]]:
                old = stack.pop()

                answer[old] = i - old
            stack.append(i)
        return answer