package SegmentDisplayTest;

import SegentDisplay.SevenSegmentDisplay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SevenSegmentDisplayTest {

    @Test
    public void testPrintNumber() {

        SevenSegmentDisplay.printNumber("11111111");
        assertEquals("11111111", SevenSegmentDisplay.getLastDisplayedNumber());
    }


}


