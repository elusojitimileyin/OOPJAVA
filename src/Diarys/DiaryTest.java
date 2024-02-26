package Diarys;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    @Test
    public void testForUnlockDairy() {
        Diary myDiary = new Diary("timi", "psjdd");
        myDiary.lockDiary();
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("psjdd");
        assertFalse(myDiary.isLocked());

    }

    @Test
    public void testForLockDairy() {
        Diary myDiary = new Diary("timi", "psjdd");
        myDiary.lockDiary();
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("psjdd");
        assertFalse(myDiary.isLocked());
        myDiary.lockDiary();
        assertTrue(myDiary.isLocked());

    }

    @Test
    public void testForUnlockDairy_createEntry() {
        Diary myDiary = new Diary("timi", "psjdd");
        myDiary.lockDiary();
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("psjdd");
        assertFalse(myDiary.isLocked());
        myDiary.createEntry(1,"title","body");
      assertEquals(1,myDiary.getUserName());
    }

}