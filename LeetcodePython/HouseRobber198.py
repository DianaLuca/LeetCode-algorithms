# You are a professional robber planning to rob houses along a street.
# Each house has a certain amount of money stashed,
# the only constraint stopping you from robbing each of them is that adjacent houses have security system
# connected and it will automatically contact the police
# if two adjacent houses were broken into on the same night.
#
# Given a list of non-negative integers representing the amount of money of each house,
# determine the maximum amount of money you can rob tonight without alerting the police.
#

class Solution(object):
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        prev, curr = 0, 0
        for el in nums:
            prev, curr = curr, max(prev + el, curr)

        return curr