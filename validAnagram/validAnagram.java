package ProblemSet.validAnagram;

public class validAnagram {
        public boolean anagram(String word1, String word2) {

            if (word1.length() != word2.length()) {
                return false;
            }

            int[] charCounts = new int[26];
            
            for (int i = 0; i < word1.length(); i++) { //loop through each letter
                //map each character into the array by subtracting it be the biggest value for lower case ascii
                charCounts[word1.charAt(i) - 'a']++;    
                charCounts[word2.charAt(i) - 'a']--;
                }
            
            //check to see if any letter isn't accounted for
            for (int count : charCounts){
                if (count != 0) {
                    return false;
                }
            }

            return true;
        }

    
}
