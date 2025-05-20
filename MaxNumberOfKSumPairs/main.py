def maxOperations(nums: list[int], k: int) -> int:
    # Brute Force exceeds the time limit
    # op = 0
    # i = 0
    # j = i + 1
    # while True:
    #     con = k - nums[i]
    #     while True:
    #         if nums[j] == con:
    #             op += 1
    #             nums.pop(i)
    #             i -= 1
    #             nums.pop(j - 1)
    #             break
    #         j += 1
    #         if j == len(nums):
    #             break
    #     i += 1
    #     j = i + 1
    #     if j == len(nums) or len(nums) == 0:
    #         break
    # return op
    i = 0
    seen = {}
    op = 0
    while i < len(nums):
        con = k - nums[i]
        if con in seen and seen[con] > 0:
            op += 1
            seen[con] -= 1
        elif nums[i] in seen:
            seen[nums[i]] += 1
        else:
            seen[nums[i]] = 1
        i += 1
    return op

nums = [1, 2, 3, 4]
k = 5
# nums = [3,1,3,4,3]
# k = 6
# nums = [2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2]
# k = 3

print(maxOperations(nums, k))