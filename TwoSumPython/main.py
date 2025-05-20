def two_sum(nums, target):
    return [[i, j] for i, x in enumerate(nums) for j, y in enumerate(nums[i+1:], i+1) if x + y == target][0]


print(two_sum([2, 7, 11, 15], 9))
