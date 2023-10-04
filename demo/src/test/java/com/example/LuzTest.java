package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

import com.example.Luz;

public class LuzTest {

    @Test
    public void testLigar() {
        Luz luz = new Luz();
        luz.ligar();
        assertTrue(luz.isLigada());
    }

    @Test
    public void testDesligar() {
        Luz luz = new Luz();
        luz.ligar();
        luz.desligar();
        assertFalse(luz.isLigada());
    }
}

