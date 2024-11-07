/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class cotizacionTest {
    static ConversorDeMoneda conversor;
    
    public cotizacionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        conversor = new ConversorDeMoneda();
        System.out.println("Bienvenido al Conversor de Moneda");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("La operación ha finalizado");
    }
    
    @Before
    public void setUp() {
         System.out.println("Ejecutando test: ");
        
    }
    
    @After
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    
    /**
     * Test of calcularCotizacion method, of class ConversorDeMoneda.
     */
    @Test(expected = ArithmeticException.class)
    public void testCotizarCero() {
        System.out.println("testCotizarCero");
        double pesos = 180000;
        double dolares = 0;
        int result = (int) conversor.calcularCotizacion(pesos, dolares);
        
    }

   
    
}
