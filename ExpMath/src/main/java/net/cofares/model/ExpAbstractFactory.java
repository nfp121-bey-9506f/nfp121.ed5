/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cofares.model;

/**
 *
 * @author Acer
 */
public abstract class ExpAbstractFactory implements Expression{
    public static Expression create(Integer i) {
        return Const.create(i);
    }
     public static Expression create(String op, Expression e1, Expression e2) {
        return ExpressionB.create(op, e1, e2);
    }
}
