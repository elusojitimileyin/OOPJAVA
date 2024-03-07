package SegmentDisplayTest;

import SegentDisplay.SevenSegmentDisplay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SevenSegmentDisplayTest {

    @Test
    public void testPrintNumberZero() {

        SevenSegmentDisplay.printNumber("11111101");
        assertEquals("11111101", SevenSegmentDisplay.getLastDisplayedNumber());
    }

    @Test
    public void testPrintNumberOne() {
        SevenSegmentDisplay mySevenSegmentDisplay = new SevenSegmentDisplay();
        SevenSegmentDisplay.printNumber("01100001");
        assertEquals("01100001", SevenSegmentDisplay.getLastDisplayedNumber());
    }

}


