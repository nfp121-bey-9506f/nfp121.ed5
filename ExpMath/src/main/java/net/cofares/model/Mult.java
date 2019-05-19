package net.cofares.model;


/**
 * Write a description of class Mult here.
 *
 * @author Jalal Hassane
 * @version 20/5/2019
 */
public class Mult extends ExpressionB
{
    public static Mult create(Expression e1, Expression e2) {
        return new Mult(e1, e2);
    }
   
    private Mult(Expression e1, Expression e2) {
        this.e1=e1;
        this.e2=e2;
    }
    @Override
    public Integer evalNum() {
        return en.evalNum(this);
    }

    @Override
    public Expression eval() {
      return Const.create(e1.evalNum()*e2.evalNum());
    }

    @Override
    public String show() {
        return "(" + e1.show() + "*" + e2.show() + ")" ;
    }
}
