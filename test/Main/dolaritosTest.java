/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value=Parameterized.class)
public class dolaritosTest {
    static ConversorDeMoneda conversor;
    static double pesos;
    static double dolares;
    
    public dolaritosTest(double pesos, double dolares) {
        dolaritosTest.pesos = pesos;
        dolaritosTest.dolares = dolares;
    }
    
    @Parameterized.Parameters
    public static Iterable<Object[]> tomarDatos(){
        return Arrays.asList(new Object[][]{{180000,1500},{120,120000},{0, "error"},{100000, -900},{111,11}});
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
        System.out.println("Pesos: "+ pesos);
        System.out.println("Dolares: "+ dolares);
        double result = conversor.calcularCotizacion(pesos, dolares);
        
    }

   
    
}
