package leetcode;

import java.util.HashMap;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
                return false;
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
        }

        return true;
    }

    public boolean canConstructTwo(String ransomNote, String magazine) {

        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);

            int matchingIndex = magazine.indexOf(r);

            if (matchingIndex == -1) {
                return false;
            }

            magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex + 1);
        }

        return true;
    }

}
