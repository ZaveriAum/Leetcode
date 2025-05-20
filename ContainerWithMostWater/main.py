class Solution:
    def maxArea(height: list[int]) -> int:
        # Brute Force
        # maxA = 0
        # for i in range(len(height)):
        #     for j in range(i + 1, len(height)):
        #         area = min(height[i], height[j]) * (j - i)
        #         maxA = max(maxA, area)
        # return maxA

        #Two pointer
        left = 0
        right = len(height) - 1
        maxA = 0
        while left < right:
            maxA = max(maxA, min(height[left], height[right]) * (right - left))
            if height[left] >= height[right]:
                right -= 1
            else:
                left += 1
        return maxA
# height = [1,8,6,2,5,4,8,3,7]
# height = [1, 1]
height = [8, 7, 2, 1]
print(Solution.maxArea(height))