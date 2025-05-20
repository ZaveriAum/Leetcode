class Solution:
    def findMedianSortedArrays(nums1: list[int], nums2: list[int]) -> float:
        merged = []
        i, j = 0, 0
        
        while i < len(nums1) and j < len(nums2):
            if nums1[i] < nums2[j]:
                merged.append(nums1[i])
                i += 1
            else:
                merged.append(nums2[j])
                j += 1
                
        while i < len(nums1):
            merged.append(nums1[i])
            i += 1
            
        while j < len(nums2):
            merged.append(nums2[j])
            j += 1
        
        mid = len(merged) // 2
        if len(merged) % 2 == 0:
            return (merged[mid-1] + merged[mid]) / 2
        else:
            return merged[mid]
        
nums1 = [1, 3, 4, 5]
nums2 = [2]
# nums1 = [1, 3]
# nums2 = [2]
# nums1 = [1,2]
# nums2 = [3,4]
print(Solution.findMedianSortedArrays(nums1, nums2))