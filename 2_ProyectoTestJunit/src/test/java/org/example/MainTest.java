package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testAdd() {
        assertEquals(4, Main.add(2, 2));
    }

    @Test
    public void testIsPositive() {
        assertTrue(Main.isPositive(5));
    }
}



