package net.cofares.model;


/**
 * Const ::= entier de java 
 * Redéfinition de equals() pour égalité entre 2 Const
 * //TODO redefinir aussi hashcode()
 * @author Pascal Fares (c) Cnam Liban
 */
public class Const implements Expression {

    public static Const create(Integer i) {
        return new Const(i);
    }
    private Integer i;

    private Const(Integer i){
        this.i=i;
    }

    @Override
    public Expression eval() {
        return this; 
    }

    @Override
    public String show() {
        return "Const:"+getI();
    }

    @Override
    public Integer evalNum() {
        return getI();
    }

    public static void main(String args[]) {

        Const instance = Const.create(10);
        System.out.println("show = "+instance.eval());
        System.out.println("show = "+instance.show());
        System.out.println("EvalNum = "+instance.evalNum());
    }
    @Override
    public int hashCode(){
        return i.intValue();
    }
    public boolean equals(Object o) {  
        if (o == this) { 
            return true; 
        } 
        if (!(o instanceof Const)) { 
            return false; 
        }
        //Ceci est de la programation deffensive assert permet
        //De verifier que la pré-condition de notre traitement est comme
        //Prévu
        //Pour utiliser assert faire java -ea <pgmJava>
        assert((o != this) && (o instanceof Const));
        //o!=this ET o instanceof Const
        Const autre = (Const) o;
        return (this.getI().intValue() == autre.i.intValue());

    }

    /**
     * @return the i
     */
    public Integer getI() {
        return i;
    }

}