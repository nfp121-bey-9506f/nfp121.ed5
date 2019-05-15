package net.cofares.model;


/**
 * Write a description of class Div here.
 *
 * @author Jalal Hassane
 * @version 6/5/2019
 */
public class Div extends ExpressionB
{
    public static Div create(Expression e1, Expression e2) {
        return new Div(e1, e2);
    }
   
    private Div(Expression e1, Expression e2) {
        this.e1=e1;
        this.e2=e2;
    }
    @Override
    public Integer evalNum() {
        return e1.evalNum() / e2.evalNum();
    }

    @Override
    public Expression eval() {
      return Const.create(e1.evalNum() / e2.evalNum());
    }

    @Override
    public String show() {
        return "(" + e1.show() + "/" + e2.show() + ")" ;
    }
}
