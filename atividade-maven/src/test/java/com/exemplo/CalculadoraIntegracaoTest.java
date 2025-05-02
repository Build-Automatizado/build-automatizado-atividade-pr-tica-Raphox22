package com.exemplo;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraIntegracaoTest {
    @Test
    public void testCalcularDobroDaSoma() {
        Calculadora calculadora = new Calculadora();
        CalculadoraService service = new CalculadoraService(calculadora);

        int resultado = service.calcularDobroDaSoma(2, 3); // (2 + 3) * 2 = 10
        assertEquals(10, resultado);
    }
}
