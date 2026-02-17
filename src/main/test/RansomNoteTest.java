package leetcode;

import org.junit.jupiter.api.Test;

public class RansomNoteTest {

    @Test
    void ransomNoteTest() {
        RansomNote ransomNote = new RansomNote();
        String ransom = "leetcode";
        String magazine = "arraylist";
        assert(!ransomNote.canConstruct(ransom, magazine));

        ransom = "aa";
        magazine = "ab";
        assert(!ransomNote.canConstruct(ransom, magazine));

        ransom = "aa";
        magazine = "aab";
        assert(ransomNote.canConstruct(ransom, magazine));
    }

    @Test
    void ransomNoteTestTwo() {
        RansomNote ransomNote = new RansomNote();
        String ransom = "leetcode";
        String magazine = "arraylist";
        assert(!ransomNote.canConstructTwo(ransom, magazine));
    }
}
