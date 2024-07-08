/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ayesh-PC
 */
public class CalculateTest {
    
    public CalculateTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of m method, of class Calculate.
     */
    @org.junit.Test
    public void testM() {
        System.out.println("m");
        int x = 10;
        int y = 20;
        Calculate instance = new Calculate();
        int expResult = 60;
        int result = instance.m(x, y);
        assertEquals(expResult, result);
        
    }
    
}
