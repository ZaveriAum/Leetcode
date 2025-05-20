class Solution:
    def kidsWithCandies(candies: list[int], extraCandies: int) -> list[bool]:
        maxCan = max(candies)
        result = []
        for candy in candies:
            if candy + extraCandies >= maxCan:
                result.append(True)
            else:
                result.append(False)
        return result

# candies = [2,3,5,1,3]
# extraCandies = 3

candies = [4,2,1,1,2]
extraCandies = 1

candies = [12,1,12]
extraCandies = 10

print(Solution.kidsWithCandies(candies=candies, extraCandies=extraCandies))