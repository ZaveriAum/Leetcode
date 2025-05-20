def remove_duplicates(nums):
    new_number = 1
    previous = nums[0]
    for i in range(1, len(nums)):
        if previous != nums[i]:
            previous = nums[i]
            nums[new_number] = nums[i]
            new_number += 1
        else:
            nums[i] = "_"
    return new_number


print(remove_duplicates([0,0,1,1,1,2,2,3,3,4]))