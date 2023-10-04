package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

import com.example.SistemaSeguranca;

public class SistemaSegurancaTest {

    @Test
    public void testAtivar() {
        SistemaSeguranca sistemaSeguranca = new SistemaSeguranca();
        sistemaSeguranca.ativar();
        assertTrue(sistemaSeguranca.isAtivado());
    }

    @Test
    public void testDesativar() {
        SistemaSeguranca sistemaSeguranca = new SistemaSeguranca();
        sistemaSeguranca.ativar();
        sistemaSeguranca.desativar();
        assertFalse(sistemaSeguranca.isAtivado());
    }
}