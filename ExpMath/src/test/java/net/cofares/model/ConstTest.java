package net.cofares.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Acer
 */
public class ConstTest {

    Const instance;

    public ConstTest() {
        instance = Const.create(10);
    }

    /**
     * Test of eval method, of class Const.
     */
    @Test
    public void testEval() {
        System.out.println("eval");
        Expression expResult = instance;
        Expression result = instance.eval();
        assertEquals(expResult, result);

    }

    /**
     * Test of show method, of class Const.
     */
    @Test
    public void testShow() {
        System.out.println("show");
        String expResult = "Const:10";
        String result = instance.show();
        assertEquals(expResult, result);

    }

    /**
     * Test of evalNum method, of class Const.
     */
    @Test
    public void testEvalNum() {
        System.out.println("evalNum");
        Integer expResult = 10;
        Integer result = instance.evalNum();
        assertEquals(expResult, result);
    }

}
