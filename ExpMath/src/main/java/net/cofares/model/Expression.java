package net.cofares.model;

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
public interface Expression {
    /**
     * Avaluation numérique
     */
    public Integer evalNum();
    /**
     * Avaluation de symplification Expression donne Une autre expression
     */
    public Expression eval();
    /**
     * Evaluation affichage de l'arbre sémantique (ou traduction)
     */
    public String show();
}
