package DiarysTest;

import Diarys.Diaries;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiariesTest {
    @Test
    public void checkForDiary(){
        Diaries newDiaries = new Diaries();

        assertEquals(0,newDiaries.getDiaries());
    }

    @Test
    public void addDiary(){
        Diaries newDiaries = new Diaries();
        assertEquals(0,newDiaries.getDiaries());
        newDiaries.addToDiary("userName","password");
        assertEquals(1,newDiaries.getDiaries());
    }
    @Test
    public void addTwoDiary(){
        Diaries newDiaries = new Diaries();
        assertEquals(0,newDiaries.getDiaries());
        newDiaries.addToDiary("userName","password");
        newDiaries.addToDiary("userName","password");
        assertEquals(2,newDiaries.getDiaries());
    }

    @Test
    public void addTwoDiary_findOneDiary(){
        Diaries newDiaries = new Diaries();
        assertEquals(0,newDiaries.getDiaries());
        newDiaries.addToDiary("userName","password");
        newDiaries.addToDiary("userName1","password");
        assertEquals(2,newDiaries.getDiaries());
        newDiaries.findByUsername("userName1");
        assertEquals(2,newDiaries.getDiaries());
    }








}