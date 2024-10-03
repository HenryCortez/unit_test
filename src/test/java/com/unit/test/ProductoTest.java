package com.unit.test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ProductoTest {

    @Test
    void testSomeMethod() {
        Producto p = new Producto();
        p.setCodigo("001");
        p.setNombre("Producto 1");
        p.setDescripcion("Descripcion del producto 1");
        p.setPrecio(10.0);
        p.setCosto(5.0);
        p.setStock(100);
        assertEquals("001", p.getCodigo());
        assertEquals("Producto 1", p.getNombre());
        assertEquals("Descripcion del producto 1", p.getDescripcion());
        assertEquals(10.0, p.getPrecio(), 0);
        assertEquals(5.0, p.getCosto(), 0);
        assertEquals(100, p.getStock());
    }
    
    
}
