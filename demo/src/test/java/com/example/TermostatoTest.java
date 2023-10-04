package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

import com.example.Termostato;

public class TermostatoTest {

    @Test
    public void testAjustarTemperaturaDesejada() {
        Termostato termostato = new Termostato(25);
        int novaTemperatura = 28;
        termostato.ajustarTemperaturaDesejada(novaTemperatura);
        assertEquals(novaTemperatura, termostato.getTemperaturaDesejada());
    }
}