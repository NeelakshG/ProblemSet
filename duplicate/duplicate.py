class duplicate:
    def containsDuplicate(self, nums):
        """
        Return True if any value appears at least twice in nums.
        """

        #approach number 1: using nested for loops
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] == nums[j]:
                    return True
    
        #approach number 2: sorting the array
        nums.sort()

        for i in range(len(nums) - 1):
            if (nums[i] == nums[i+1]):
                return True
            
        #approach number 3: using a hashet  

        if (len(set(nums)) < len(nums)):
            return True 

        numSet = set()
        for n in nums:
            if n in numSet:
                return True 
            numSet.add(n)
        return False
    

d = duplicate()

nums = [1, 2, 3, 4, 5]
result = d.containsDuplicate(nums)

print(result)