package DiarysTest;

import Diarys.Diary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    @Test
    public void testForUnlockDairy() {
        Diary myDiary = new Diary("timi", "1111");
        myDiary.lockDiary("1111");
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("1111");
        assertFalse(myDiary.isLocked());

    }

    @Test
    public void testForLockDairy() {
        Diary myDiary = new Diary("timi", "1111");
        myDiary.lockDiary("1111");
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("1111");
        assertFalse(myDiary.isLocked());
        myDiary.lockDiary("1111");
        assertTrue(myDiary.isLocked());

    }

    @Test
    public void testForUnlockDairy_createEntry() {
        Diary myDiary = new Diary("timi", "1111");
        myDiary.lockDiary("1111");
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("1111");
        assertFalse(myDiary.isLocked());
        myDiary.createEntry(1,"title","body");
      assertEquals(  1 ,myDiary.getNumberOfEntry());
        myDiary.createEntry(2,"title","body");
        assertEquals(  2 ,myDiary.getNumberOfEntry());


    }

    @Test
    public void testForUnlockDairy_createEntry_removeEntry() {
        Diary myDiary = new Diary("timi", "1111");
        myDiary.lockDiary("1111");
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("1111");
        assertFalse(myDiary.isLocked());
        myDiary.createEntry(1,"title","body");
        assertEquals(  1 ,myDiary.getNumberOfEntry());
        myDiary.createEntry(2,"title","body");
        assertEquals(  2 ,myDiary.getNumberOfEntry());
        myDiary.deleteEntry(1);
        assertEquals( 1,myDiary.getNumberOfEntry());
    }
    @Test
    public void testForUnlockDairy_createEntry_findEntry() {
        Diary myDiary = new Diary("timi", "1111");
        myDiary.lockDiary("1111");
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("1111");
        assertFalse(myDiary.isLocked());
        myDiary.createEntry(1,"title","body");
        assertEquals(  1 ,myDiary.getNumberOfEntry());
        myDiary.createEntry(2,"title","body");
        assertEquals(  2 ,myDiary.getNumberOfEntry());
        myDiary.findEntryById(1);
        assertEquals(2, myDiary.getNumberOfEntry());
    }

}