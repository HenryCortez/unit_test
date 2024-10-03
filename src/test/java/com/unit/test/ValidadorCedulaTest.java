package com.unit.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ValidadorCedulaTest {
   
    @Test
    public void logitudCorrecta(){
        
        assertEquals(false, ValidadorCedula.longitudCorrecta("18054723888"));
        assertEquals(false, ValidadorCedula.validar("18054723888"));
    }
    @Test
    public void rangoCedulasValidas() {
        assertEquals(false, ValidadorCedula.rangoCedulasValidas("2505472388"));
        assertEquals(false, ValidadorCedula.rangoCedulasValidas("0005472388"));
        assertEquals(false, ValidadorCedula.validar("2505472388"));
    }
    @Test
    public void soloNumeros(){
        assertEquals(false, ValidadorCedula.soloNumeros("0a05472388"));
        assertEquals(true, ValidadorCedula.soloNumeros("1805472388"));
        assertEquals(false, ValidadorCedula.validar("0a05472388"));
    }
    @Test
    public void tercerDijito(){
        assertEquals(false, ValidadorCedula.tercerDigito("0165472388"));
        assertEquals(true, ValidadorCedula.tercerDigito("1805472388"));
        assertEquals(false, ValidadorCedula.validar("0165472388"));
    }

    @Test
    public void digitoVerificador() {
        assertEquals(false, ValidadorCedula.numVerificador("1805472388"));
        assertEquals(true, ValidadorCedula.numVerificador("1104680200"));
        assertEquals(true, ValidadorCedula.numVerificador("1805472386"));
        assertEquals(false, ValidadorCedula.validar("1805472388"));
    }

    @Test
    public void cedulaNoValida() {
        assertEquals(false, ValidadorCedula.validar("1805472388"));
    }
    @Test
    public void cedulaValida() {
        ValidadorCedula val = new ValidadorCedula();
        val.instanciaCorrecta();
        assertEquals(true, ValidadorCedula.validar("1805472386"));
    }
    
    
    
    
   
}
