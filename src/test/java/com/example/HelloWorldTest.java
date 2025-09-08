package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
public class HelloWorldTest {
    @Test
    public void testGetFarewellMessage() {
        ByeWorld byeWorld = new ByeWorld();
        assertEquals("Goodbye, World!", byeWorld.getFarewellMessage());
    }
}
