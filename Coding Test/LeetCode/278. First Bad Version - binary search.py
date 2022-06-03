class Solution:
    def firstBadVersion(self, n: int) -> int:
        low = 0
        high = n
        while(low<=high):
            mid = (low+high)//2
            if isBadVersion(mid) and not isBadVersion(mid-1):
                return mid
            if isBadVersion(mid):
                high = mid-1
            else:
                low = mid+1
        return low
