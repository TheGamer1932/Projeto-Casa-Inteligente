package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

import com.example.ArCondicionado;

public class ArCondicionadoTest {

    @Test
    public void testAumentarTemperatura() {
        ArCondicionado arCondicionado = new ArCondicionado();
        int temperaturaInicial = arCondicionado.getTemperatura();
        arCondicionado.aumentarTemperatura();
        assertEquals(temperaturaInicial + 1, arCondicionado.getTemperatura());
    }

    @Test
    public void testDiminuirTemperatura() {
        ArCondicionado arCondicionado = new ArCondicionado();
        int temperaturaInicial = arCondicionado.getTemperatura();
        arCondicionado.diminuirTemperatura();
        assertEquals(temperaturaInicial - 1, arCondicionado.getTemperatura());
    }
}
