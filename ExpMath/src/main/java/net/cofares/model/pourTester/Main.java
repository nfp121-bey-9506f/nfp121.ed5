/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cofares.model.pourTester;

import net.cofares.model.Expression;
import net.cofares.visiteur.eval.EvalShow;
import net.cofares.visiteur.eval.EvalToExp;

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String ...args) {
        EvalShow es = new EvalShow();
        EvalToExp ete = new EvalToExp();
        
        Expression c1 = Expression.create(10);
        Expression c2 = Expression.create(20);
        Expression a1 = Expression.create("+", c1, c2);
        Expression s1 = Expression.create("-", a1, c2);
        
        //Evaluateur statique!
        System.out.printf("avalNum(c1)=%d\n",c1.evalNum());
        System.out.printf("avalNum(c2)=%d\n",c2.evalNum());
        System.out.printf("avalNum(a1=(c1+c2))=%d\n",a1.evalNum());
        System.out.printf("avalNum(s1=(a1-c2))=%d\n",s1.evalNum());
        
        //Utilisation de EvalShow : par injection d'un évaluateur
        System.out.printf("evalShow(c1)=%s\n",c1.evalAccept(es));
        System.out.printf("evalShow(c2)=%s\n",c2.evalAccept(es));
        System.out.printf("evalShow(a1=(c1+c2))=%s\n",a1.evalAccept(es));
        System.out.printf("evalShow(s1=(a1-c2))=%s\n",s1.evalAccept(es));
        
    }
}
