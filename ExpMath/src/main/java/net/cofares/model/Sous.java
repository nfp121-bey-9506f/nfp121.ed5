package net.cofares.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Pattern composite + Factory
 * Appelé par la super classe ExpressionB qui implÃ©mente la composition + Abstract factory en fonction
 * de l'opÃ©ration
 * @author Acer
 */
public class Sous extends ExpressionB {

    public static Sous create(Expression e1, Expression e2) {
        return new Sous(e1, e2);
    }
   
    private Sous(Expression e1, Expression e2) {
        this.e1=e1;
        this.e2=e2;
    }
    @Override
    public Integer evalNum() {
        return e1.evalNum() - e2.evalNum();
    }

    @Override
    public Expression eval() {
      return Const.create(e1.evalNum()-e2.evalNum());
    }

    @Override
    public String show() {
        return "(" + e1.show() + "-" + e2.show() + ")" ;
    }
    
}
