package com.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testDivi() {
        double a = 4, b = 2;
        assertEquals(2, Calculadora.divi(a, b));
    }

    @SuppressWarnings("static-access")
    @Test
    public void testMulti() {
        double a = 2, b = 3;
        Calculadora c = new Calculadora();
        assertEquals(6, c.multi(a, b));
    }

    @Test
    public void testResta() {
        double a = 2, b = 3;
        assertEquals(1, Calculadora.resta(b, a));
    }

    @Test
    public void testSuma() {
        double a = 2, b = 3;
        assertEquals(5, Calculadora.suma(a, b));
    }

    @Test
    public void divisionParaCero() {
        assertThrows( IllegalArgumentException.class, () -> Calculadora.divi(4, 0));
    }
    
}
