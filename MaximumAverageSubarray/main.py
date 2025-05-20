def findMaxAverage(nums: list[int], k: int) -> float:
    maxA = float('-inf')
    total = 0
    for i in range(k):
        total += nums[i]
    maxA = max(maxA, total/k)
    for i in range(k, len(nums)):
        total -= nums[i - k]
        total += nums[i]
        maxA = max(maxA, total/k)
    return maxA

nums = [1, 12, -5, -6, 50, 3]
k = 4
# nums = [5]
# k = 1

print(findMaxAverage(nums, k))