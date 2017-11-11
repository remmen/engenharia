/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tia30870984;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 30870984
 */
public class CalculosTest {
   static  int[] digitos = new int[8];
    
    public CalculosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        digitos[0] = 3;
        digitos[1] = 0;
        digitos[2] = 8;
        digitos[3] = 7;
        digitos[4] = 0;
        digitos[5] = 9;
        digitos[6] = 8;
        digitos[7] = 4;        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calc method, of class Calculos.
     */
    @Test
    public void testSoma() {
        /*System.out.println("calc");
        int[] digitos = null;
        int modo = 0;
        Calculos instance = new Calculos();
        float expResult = 0.0F;
        float result = instance.calc(digitos, modo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
        
        Calculos c = new Calculos();

        assertEquals(39, c.calc(digitos, 1), 0.0);
    }
    
     @Test
    public void testMedia() {
        /*System.out.println("calc");
        int[] digitos = null;
        int modo = 0;
        Calculos instance = new Calculos();
        float expResult = 0.0F;
        float result = instance.calc(digitos, modo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
        
        Calculos c = new Calculos();

        assertEquals(4.875, c.calc(digitos, 2), 0.0);
    }
    
    @Test
    public void testMaiorDigito() {
        Calculos c = new Calculos();

        assertEquals(9, c.calc(digitos, 3), 0.0);
    }
    
    @Test
    public void testMenorDigito() {
        Calculos c = new Calculos();

        assertEquals(0, c.calc(digitos, 4), 0.0);
    }
    
    @Test
    public void testMaiorOcorrencia() {
        
        Calculos c = new Calculos();

        assertEquals(8, c.calc(digitos, 5), 0.0);
    }
    
    @Test
    public void testQuantidadeDigitosPares() {
        
        Calculos c = new Calculos();

        assertEquals(5, c.calc(digitos, 6), 0.0);
    }
    
    @Test
    public void testQuantidadeDigitosImpares() {
        
        Calculos c = new Calculos();

        assertEquals(3, c.calc(digitos, 7), 0.0);
    }
    
    @Test
    public void testQuatroPrimeiroDividePorQuatroUltimos() {
        
        Calculos c = new Calculos();

        assertEquals(0.857142857, c.calc(digitos, 8), 0.0);
    }
    
    @Test
    public void testProdutoTodosOsNumeros() {
        
        Calculos c = new Calculos();

        assertEquals(39, c.calc(digitos, 9), 0.0);
        assertEquals(30, c.calc(digitos, 10), 0.0);
    }    
    
    @Test
    public void testProdutoTodosOsNumerosExcluindoMaior() {
        
        Calculos c = new Calculos();

        assertEquals(30, c.calc(digitos, 10), 0.0);
    }        
}
