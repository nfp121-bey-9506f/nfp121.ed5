/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cofares.model.pourTester;

import net.cofares.model.Expression;

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String ...args) {
        Expression c1 = Expression.create(10);
        Expression c2 = Expression.create(20);
        Expression a1 = Expression.create("+", c1, c2);
        Expression s1 = Expression.create("-", a1, c2);
        
        System.out.printf("avalNum(c1)=%d\n",c1.evalNum());
        System.out.printf("avalNum(c2)=%d\n",c2.evalNum());
        System.out.printf("avalNum(a1=(c1+c2))=%d\n",a1.evalNum());
        System.out.printf("avalNum(s1=(a1-c2))=%d\n",s1.evalNum());
        
    }
}
