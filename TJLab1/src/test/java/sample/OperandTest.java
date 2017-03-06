package sample;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Darkfree on 05.03.2017.
 */
public class OperandTest {
    @Test
    public void getValue() throws Exception {
        Operand op = new Operand();
        op.setValue(true);
        Assert.assertEquals("True",op.getValue());
        System.out.println("getValue() - was tested success");
    }

    @Test
    public void setValue() throws Exception {
        Operand op = new Operand();
        op.setValue(true);
        Assert.assertEquals("True",op.getValue());
        System.out.println("setValue() - was tested success");
    }

    @Test
    public void setValue1() throws Exception {
        Operand op = new Operand();
        op.setValue("True");
        Assert.assertEquals("True",op.getValue());
        System.out.println("setValue1() - was tested success");
    }

    @Test
    public void _toString() throws Exception {
        Operand op = new Operand("True");
        Assert.assertEquals("Operand{value='True'}",op.toString().intern());
        System.out.println("_toString() - was tested success");
    }

}