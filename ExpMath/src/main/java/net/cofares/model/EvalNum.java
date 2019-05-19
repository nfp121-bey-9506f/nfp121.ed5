/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cofares.model;

/**
 * Le visiteur EvalNum
 * @author Acer
 */
public class EvalNum {
    Integer evalNum(Const c){
        return c.getI();
    }
    
    Integer evalNum(Add a){
        return a.e1.evalNum()+a.e2.evalNum();
    }
    
    Integer evalNum(Sous a){
        return a.e1.evalNum()-a.e2.evalNum();
    }
    
    Integer evalNum(Mult m){
        return m.e1.evalNum()*m.e2.evalNum();
    }
    
    Integer evalNum(Div d){
        return d.e1.evalNum()/d.e2.evalNum();
    }
}
