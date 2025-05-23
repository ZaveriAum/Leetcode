def longestOnes(nums: list[int], k: int) -> int:
    l = 0
    maxLength = 0
    zeros = 0
    for r in range(len(nums)):
        if nums[r] == 0:
            zeros += 1
        while zeros > k:
            if nums[l] == 0:
                zeros -= 1
            l += 1
        maxLength = max(maxLength, r - l + 1)
    return maxLength
nums = [1,1,1,0,0,0,1,1,1,1,0]
k = 2
# nums = [0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1]
# k = 3

print(longestOnes(nums, k))