package net.cofares.model;

import net.cofares.visiteur.eval.Eval;
import net.cofares.visiteur.eval.EvalNum;
import net.cofares.visiteur.eval.EvalShow;
import net.cofares.visiteur.eval.EvalToExp;

/**
 * La grammaire
 * 
 * Expression ::= Const | ExpressionB
 * <br/>
 * Const ::= Integer Java (final)
 * <br/>
 * ExpressionB ::= (Expression op Expression)
 * <br/>
 * op symbole final prenant une des valeurs suivantes: + | - | ...
 * <br/>
 * OU
 * <br/>
 * ExpressionB :== Addition | Soustraction | ...
 * <br/>
 * Addition :== (Expression + Expression)
 * <br/>
 * Soustraction ::= (Expression + Expression)
 * <br/>
 * <hr/>
 * Quand on utilise le pattern composite pour créer une Expression. En fait 
 * On créer l'AST l'arbre sémantquee Abstrait 
 * (Abstaract Semantic Tree en anglais)
 * ...
 * @author Pascal Fares
 */
public abstract class Expression {
    static EvalNum en = new EvalNum(); //Les visiteur 
    static EvalToExp e = new EvalToExp();
    static EvalShow es = new EvalShow();
    // à injecter apr un setter, à la création une evaluateur par defaut.

    //Factory Expression create : style visiteur
    public static Expression create(Integer i) {
        return Const.create(i);
    }
    public static Expression create(String op, Expression e1, Expression e2) {
        return ExpressionB.create(op, e1, e2);
    }
    /**
     * Avaluation numérique
     * @return 
     */
    abstract public Integer evalNum();
    /**
     * Avaluation de symplification Expression donne Une autre expression
     * @return 
     */
    abstract public Expression eval();
    /**
     * Evaluation affichage de l'arbre sémantique (ou traduction)
     * @return 
     */
    abstract public String show();
    
    abstract public <T> T evalAccept(Eval<T> e); 
}
