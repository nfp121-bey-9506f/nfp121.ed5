/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cofares.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author Acer
 */
public class AddTest {
    Add instance;
    public AddTest() {
         instance = Add.create(Const.create(20),Const.create(10));
    }
    @BeforeAll
    public void setInit() {
        System.out.println("before all ---");
        instance = Add.create(Const.create(20),Const.create(10));
    }
    @BeforeEach
    public void setUp() {
        System.out.println("before ---");
        instance = Add.create(Const.create(20),Const.create(10));
    }

    /**
     * Test of evalNum method, of class Add.
     */
    @Test
    public void testEvalNum() {
        System.out.println("evalNum");

        Integer expResult = 30;
        Integer result = instance.evalNum();
        assertEquals(expResult, result);

    }

    /**
     * Test of eval method, of class Add.
     */
    @Test
    public void testEval() {
        System.out.println("eval");

        Expression expResult = Const.create(30);
        Expression result = instance.eval();
        assertEquals(expResult, result);

    }

    /**
     * Test of show method, of class Add.
     */
    @Test
    public void testShow() {
        System.out.println("show !");
        String expResult = "(Const:20+Const:10)";
        String result = instance.show();
        assertEquals(expResult, result);

    }
    
}
