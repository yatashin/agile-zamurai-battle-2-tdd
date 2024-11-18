package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SamuraiTest {

    @Test
    public void firstTest() {
        var samurai = new Samurai();
        assertEquals(samurai.slush(), "Hello");
    }

}