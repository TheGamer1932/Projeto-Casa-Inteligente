package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

import com.example.DetectarMovimento;

public class DetectarMovimentoTest {

    @Test
    public void testVerificarMovimento() {
        DetectarMovimento sensor = new DetectarMovimento();
        // Não é possível prever o resultado exato, pois é baseado em uma simulação.
        boolean resultado = sensor.verificarMovimento();
        assertTrue(resultado == sensor.isMovimentoDetectado());
    }
}