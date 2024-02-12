public class Valid_Anagram {
    /*
        Given two strings s and t, return true if t is an anagram of s, and false otherwise.
        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
        typically using all the original letters exactly once.

        Example 1:

        Input: s = "anagram", t = "nagaram"
        Output: true
        Example 2:

        Input: s = "rat", t = "car"
        Output: false
    */

    public boolean isAnagram(String s, String t) {
        //Base case
        if(s.length() != t.length()){ //must be equal otherwise return false
            return false;
        }
        // An array of size 26 is created to store the count of each character.
        // The assumption here is that the strings only contain lowercase English letters.
        int[] store = new int[24];
        for(int i=0; i<s.length(); i++) {
            store[s.charAt(i) - 'a']++; //ascii of a = 97 (a-a = 0), store[0] = 1, and so on
            store[t.charAt(i) - 'a']--; //ascii of n = 110 (n-a = 13)store[13] = -1, and so on
        }
        for(int i : store) {
            if(i!=0){
                //After the loop, the code checks if all counts in the store array are zero.
                // If they are, it means the characters' counts are equal(true), and the strings are anagrams.
                return false;
            }
        }
        return true; // anagram true
    }
}
