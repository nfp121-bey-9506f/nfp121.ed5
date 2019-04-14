package net.cofares.model;

import net.cofares.visiteur.eval.Eval;

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
        return en.eval(this);
    }

    @Override
    public Expression eval() {
        return e.eval(this); 
    }

    @Override
    public String show() {
        return es.eval(this);
    }
    
    //Le plus général
    @Override
    public <T> T evalAccept(Eval<T> e) {
       return e.eval(this);
    }
    
}
