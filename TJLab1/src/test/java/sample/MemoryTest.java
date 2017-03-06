package sample;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Darkfree on 05.03.2017.
 */
public class MemoryTest {
    Memory mem = new Memory(new Operand("True"));
    @Test
    public void getValue() throws Exception {
        Assert.assertEquals(new Operand("True").toString().intern(),mem.getValue().toString().intern());
        System.out.println("getValue() - was tested success");
    }

    @Test
    public void setValue() throws Exception {
        mem.setValue(new Operand("False"));
        Assert.assertEquals(new Operand("False").toString().intern(),mem.getValue().toString().intern());
        System.out.println("setValue() - was tested success");
    }

    @Test
    public void _toString() throws Exception {
        Assert.assertEquals("True",mem.toString());
        System.out.println("_toString() - was tested success");
    }

}