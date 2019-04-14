package net.cofares.model;

import net.cofares.visiteur.eval.Eval;

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
    
    //Utilisation du pattern visiteur pour evalNum, eval et show 
    //les 3 methodes sont la methiode accept, et en,e,es.eval(this) sont le visit 
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
