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


public class ConversorTest {
    static ConversorDeMoneda conversor;
    
    public ConversorTest() {
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
     * Test of convertirDolares method, of class ConversorDeMoneda.
     */
    @Test
    public void testConvertirDolares() {
        System.out.println("convertirDolares");
        double dolares = 1200.0;
        double expResult = 1200000.0;
        double result = conversor.convertirDolares(dolares);
        assertEquals(expResult, result, 0.001);
        
    }

    /**
     * Test of convertirPesos method, of class ConversorDeMoneda.
     */
    @Test
    public void testConvertirPesos() {
        System.out.println("convertirPesos");
        double pesos = 1000.0;
        double expResult = 1.0;
        double result = conversor.convertirPesos(pesos);
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of calcularCotizacion method, of class ConversorDeMoneda.
     */
    @Test
    public void testCalcularCotizacion() {
        System.out.println("calcularCotizacion");
        double pesos = 1800000;
        double dolares = 1620.0;
        double expResult = 1111.111;
        double result = conversor.calcularCotizacion(pesos, dolares);
        assertEquals(expResult, result, 0.001);
        
    }

    /**
     * Test of aumentarSaldo method, of class ConversorDeMoneda.
     */
    @Test
    public void testAumentarSaldo() {
        System.out.println("aumentarSaldo");
        double saldo = 500.0;
        double dolares = 1200.0;
        double expResult = 1700.0;
        double result = conversor.aumentarSaldo(saldo, dolares);
        assertEquals(expResult, result, 0.001);
        
    }

    /**
     * Test of cantBilletesExtraidos method, of class ConversorDeMoneda.
     */
    @Test
    public void testCantBilletesExtraidos() {
        System.out.println("cantBilletesExtraidos");
        double montoExtraer = 2100;
        int denominacion = 100;
        int expResult = 21;
        int result = conversor.cantBilletesExtraidos(montoExtraer, denominacion);
        assertEquals(expResult, result, 0.001);
        
    }
    
}
