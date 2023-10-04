package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

import com.example.FechaduraEletronica;

public class FechaduraEletronicaTest {

    @Test
    public void testTrancar() {
        FechaduraEletronica fechadura = new FechaduraEletronica();
        fechadura.trancar();
        assertTrue(fechadura.isTrancada());
    }

    @Test
    public void testDestrancar() {
        FechaduraEletronica fechadura = new FechaduraEletronica();
        fechadura.trancar();
        fechadura.destrancar();
        assertFalse(fechadura.isTrancada());
    }
}