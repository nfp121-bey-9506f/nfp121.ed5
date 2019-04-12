package net.cofares.model;




/**
 *
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
     public boolean equals(Object o) { 
  
    // If the object is compared with itself then return true   
        if (o == this) { 
            return true; 
        } 

        if (!(o instanceof Const)) { 
            return false; 
        } 
        else {
            Const autre = (Const) o;
            return (this.getI().intValue() == autre.i.intValue());
        }
}

    /**
     * @return the i
     */
    public Integer getI() {
        return i;
    }

}