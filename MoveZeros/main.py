class Solution:
    def moveZeroes(nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # WIthout using extra space for another array
        # i : int = 0
        # n : int = len(nums)
        # while i < n:
        #     if nums[i] == 0:
        #         nums.insert(len(nums), 0)
        #         nums.pop(i)
        #         n -= 1
        #         continue
        #     i += 1
        # counter : int = 0 # counts the number of zero
        # n : int = len(nums)
        # i : int = 0
        # while i < n:
        #     if nums[i] == 0:
        #         counter += 1
        #         nums.pop(i)
        #         n -= 1
        #         continue
        #     i += 1
                
        # for count in range(0, counter):
        #     nums.append(0)
        nonzero, i = 0, 0  # Initialize pointers
        n = len(nums)
        while i < n:
            if nums[i] != 0:
                # Swap non-zero element with the element at the `nonzero` pointer
                nums[i], nums[nonzero] = nums[nonzero], nums[i]
                nonzero += 1  # Move `nonzero` pointer
            i += 1
        print(nums)
nums = [0, 1, 0, 3, 12]
# nums = [0]
Solution.moveZeroes(nums)