package net.cofares.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Pattern composite + Factory
 * Appelé par la super classe ExpressionB qui implémente la composition + Abstract factory en fonction
 * de l'opération
 * @author Acer
 */
public class Add extends ExpressionB {

    public static Add create(Expression e1, Expression e2) {
        return new Add(e1, e2);
    }
   
    private Add(Expression e1, Expression e2) {
        this.e1=e1;
        this.e2=e2;
    }
    @Override
    public Integer evalNum() {
        return en.evalNum(this);
    }

    @Override
    public Expression eval() {
      return Const.create(e1.evalNum()+e2.evalNum());
    }

    @Override
    public String show() {
        return "(" + e1.show() + "+" + e2.show() + ")" ;
    }
    
}
