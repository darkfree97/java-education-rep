package sample;

import org.omg.CORBA.ORBPackage.InvalidName;

/**
 * Created by Darkfree on 08.11.2016.
 */
public class Operand {
    private String value;

    public Operand() {
    }

    public Operand(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        try {
            if (value.equals("True")||value.equals("False")&&value.equals("None")){
                this.value = value;
            }
            else{
                throw new NullPointerException("Invalid value");
            }
        }
        catch (NullPointerException exp){
            System.out.println(exp);
        }
    }

    public void setValue(Boolean value) {
        try {
            if (value.equals(true)||value.equals(false)){
                String val = value.toString().substring(0,1).toUpperCase();
                val+=value.toString().substring(1);
                this.value = val;
            }
            else{
                throw new NullPointerException("Invalid value");
            }
        }
        catch (NullPointerException exp){
            System.out.println(exp);
        }
    }

    @Override
    public String toString() {
        return "Operand{" +
                "value='" + value + '\'' +
                '}';
    }
}
