package ProblemSet.duplicate;

import java.util.HashSet;

class duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenNumbers = new HashSet<>();

        //loop through every number in the array, add to the set, if set contains the num return true
        for (int num : nums) {
            if (seenNumbers.contains(num)) {
                return true;
            }

            seenNumbers.add(num);
        }
        return false;
    }
}