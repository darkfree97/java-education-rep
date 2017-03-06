package sample;

import java.rmi.server.Operation;

/**
 * Created by Darkfree on 08.11.2016.
 */
public class Operations {
    private Operand val1,val2;

    public Operations(Operand val1, Operand val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public Operations(Boolean f1, Boolean f2) {
        this.val1 = new Operand(f1.toString());
        this.val2 = new Operand(f2.toString());
    }

    public Operand getVal1() {
        return val1;
    }

    public void setVal1(Operand val1) {
        this.val1 = val1;
    }

    public Operand getVal2() {
        return val2;
    }

    public void setVal2(Operand val2) {
        this.val2 = val2;
    }

    public Operand getAnd(){
        if(val1.getValue().equals("False")){
            return val1;
        }
        else if(val2.getValue().equals("False")){
            return val2;
        }
        else if(val1.getValue().equals("True")&&val2.getValue().equals("True")){
            return val1;
        }
        return new Operand("None");
    }

    public Operand getOr(){
        if(val1.getValue().equals("True")){
            return val1;
        }
        if(val2.getValue().equals("True")){
            return val2;
        }
        if(val1.getValue().equals("False")&&val2.getValue().equals("False")){
            return val1;
        }
        if(val1.getValue().equals("False")&& val2.getValue().equals("None")){
            return val2;
        }
        return val1;
    }

    public Operand getXor(){
        if((!val1.getValue().equals(val2.getValue()))&&(!val1.getValue().equals("None"))&&(!val2.getValue().equals("None"))){
            return new Operand("True");
        }
        if((val1.getValue().equals(val2.getValue()))&&(!val1.getValue().equals("None"))&&(!val2.getValue().equals("None"))){
            return new Operand("False");
        }
        return  new Operand("None");
    }

    public Operand getNotF(){
        if((val1.getValue().equals("False"))){
            return new Operand("True");
        }
        if((val1.getValue().equals("True"))){
            return new Operand("False");
        }
        return  new Operand("None");
    }

    public Operand getNotL(){
        if((val2.getValue().equals("False"))){
            return new Operand("True");
        }
        if((val2.getValue().equals("True"))){
            return new Operand("False");
        }
        return  new Operand("None");
    }

    public Operand getEqv(){
        if((val1.getValue().equals(val2.getValue()))&&(!val1.getValue().equals("None"))&&(!val2.getValue().equals("None"))){
            return new Operand("True");
        }
        if((val1.getValue()!=val2.getValue())&&(!val1.getValue().equals("None"))&&(!val2.getValue().equals("None"))){
            return new Operand("False");
        }
        return  new Operand("None");
    }

    public Operand getShefer(){
        if(val1.getValue().equals("True")&&val2.getValue().equals("True")){
            return new Operand("False");
        }
        if(val1.getValue().equals("False")||val2.getValue().equals("False")){
            return  new Operand("True");
        }
        return new Operand("None");
    }

    public Operand getPirs(){
        if(val1.getValue().equals("False")&&val2.getValue().equals("False")){
            return new Operand("True");
        }
        if(val1.getValue().equals("None") || val2.getValue().equals("None")){
            return  new Operand("None");
        }
        return new Operand("False");
    }


}
