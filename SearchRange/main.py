def searchRange( nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: List[int]
    """
    low = 0
    high = len(nums) - 1
    mid = low + (low + high)//2
    if low > high:
        return []
    else:
        indexes = searchRange(nums[0:mid - 1], target)
        indexes.extent(searchRange(nums[mid + 1], target))

        if nums[mid] == target:
            indexes.append(mid)

    if indexes:
        return [min(indexes), max(indexes)]
    return [-1, -1]
