package net.cofares.model;

/**
 *
 * @author Acer
 */
public class ExpFactory{
    public static Expression create(Integer i) {
        return Const.create(i);
    }
     public static Expression create(String op, Expression e1, Expression e2) {
        return ExpressionB.create(op, e1, e2);
    }
}
