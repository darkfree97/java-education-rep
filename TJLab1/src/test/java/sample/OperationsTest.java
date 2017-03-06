package sample;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by Darkfree on 01.03.2017.
 */
public class OperationsTest {
    private Operand _true = new Operand("True");
    private Operand _false = new Operand("False");
    private Operand _none = new Operand("None");

    private Operations op1 = new Operations(_true,_true);
    private Operations op2 = new Operations(_true,_false);
    private Operations op3 = new Operations(_true,_none);
    private Operations op4 = new Operations(_false,_true);
    private Operations op5 = new Operations(_false,_false);
    private Operations op6 = new Operations(_false,_none);
    private Operations op7 = new Operations(_none,_true);
    private Operations op8 = new Operations(_none,_false);
    private Operations op9 = new Operations(_none,_none);

    @Test
    public void getAndTrueTrue() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op1.getAnd().toString().intern());

    }
    @Test
    public void getAndTrueFalse() throws Exception {
        Assert.assertEquals(_false.toString().intern(),op2.getAnd().toString().intern());

    }
    @Test
    public void getAndTrueNone() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op3.getAnd().toString().intern());

    }
    @Test
    public void getAndFalseTrue() throws Exception {
        Assert.assertEquals(_false.toString().intern(),op4.getAnd().toString().intern());

    }
    @Test
    public void getAndFalseFalse() throws Exception {
        Assert.assertEquals(_false.toString().intern(),op5.getAnd().toString().intern());

    }
    @Test
    public void getAndFalseNone() throws Exception {
        Assert.assertEquals(_false.toString().intern(),op6.getAnd().toString().intern());

    }
    @Test
    public void getAndNoneTrue() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op7.getAnd().toString().intern());

    }
    @Test
    public void getAndNoneFalse() throws Exception {
        Assert.assertEquals(_false.toString().intern(),op8.getAnd().toString().intern());
        System.out.println("getAnd() - was tested success");
    }
    @Test
    public void getAndNoneNone() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op9.getAnd().toString().intern());
    }


    @Test
    public void getOrTrueTrue() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op1.getOr().toString().intern());

    }
    @Test
    public void getOrTrueFalse() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op2.getOr().toString().intern());

    }
    @Test
    public void getOrTrueNone() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op3.getOr().toString().intern());

    }
    @Test
    public void getOrFalseTrue() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op4.getOr().toString().intern());

    }
    @Test
    public void getOrFalseFalse() throws Exception {
        Assert.assertEquals(_false.toString().intern(),op5.getOr().toString().intern());

    }
    @Test
    public void getOrFalseNone() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op6.getOr().toString().intern());

    }
    @Test
    public void getOrNoneTrue() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op7.getOr().toString().intern());

    }
    @Test
    public void getOrNoneFalse() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op8.getOr().toString().intern());

    }
    @Test
    public void getOrNoneNone() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op9.getOr().toString().intern());
    }

    @Test
    public void getXorTrueTrue() throws Exception {
        Assert.assertEquals(_false.toString().intern(),op1.getXor().toString().intern());

    }

    @Test
    public void getXorTrueFalse() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op2.getXor().toString().intern());

    }
    @Test
    public void getXorTrueNone() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op3.getXor().toString().intern());

    }
    @Test
    public void getXorFalseTrue() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op4.getXor().toString().intern());

    }@Test
    public void getXorFalseFalse() throws Exception {
        Assert.assertEquals(_false.toString().intern(),op5.getXor().toString().intern());

    }
    @Test
    public void getXorFalseNone() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op6.getXor().toString().intern());

    }
    @Test
    public void getXorNoneTrue() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op7.getXor().toString().intern());

    }
    @Test
    public void getXorNoneFalse() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op8.getXor().toString().intern());

    }
    @Test
    public void getXorNoneNone() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op9.getXor().toString().intern());
    }


    @Test
    public void getNotFTrueTrue() throws Exception {
        Assert.assertEquals(_false.toString().intern(),op1.getNotF().toString().intern());

    }
    @Test
    public void getNotFTrueFalse() throws Exception {
        Assert.assertEquals(_false.toString().intern(),op2.getNotF().toString().intern());

    }
    @Test
    public void getNotFTrueNone() throws Exception {
        Assert.assertEquals(_false.toString().intern(),op3.getNotF().toString().intern());

    }
    @Test
    public void getNotFFalseTrue() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op4.getNotF().toString().intern());

    }
    @Test
    public void getNotFFalseFalse() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op5.getNotF().toString().intern());

    }
    @Test
    public void getNotFFalseNone() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op6.getNotF().toString().intern());

    }
    @Test
    public void getNotFNoneTrue() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op7.getNotF().toString().intern());

    }
    @Test
    public void getNotFNoneFalse() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op8.getNotF().toString().intern());

    }
    @Test
    public void getNotFNoneNone() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op9.getNotF().toString().intern());

    }

    @Test
    public void getNotLTrueTrue() throws Exception {
        Assert.assertEquals(_false.toString().intern(),op1.getNotL().toString().intern());

    }
    @Test
    public void getNotLTrueFalse() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op2.getNotL().toString().intern());

    }
    @Test
    public void getNotLTrueNone() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op3.getNotL().toString().intern());

    }
    @Test
    public void getNotLFalseTrue() throws Exception {
        Assert.assertEquals(_false.toString().intern(),op4.getNotL().toString().intern());

    }
    @Test
    public void getNotLFalseFalse() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op5.getNotL().toString().intern());

    }
    @Test
    public void getNotLFalseNone() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op6.getNotL().toString().intern());

    }
    @Test
    public void getNotLNoneTrue() throws Exception {
        Assert.assertEquals(_false.toString().intern(),op7.getNotL().toString().intern());

    }
    @Test
    public void getNotLNoneFalse() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op8.getNotL().toString().intern());

    }
    @Test
    public void getNotLNoneNone() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op9.getNotL().toString().intern());
    }



    @Test
    public void getEqvTrueTrue() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op1.getEqv().toString().intern());

    }
    @Test
    public void getEqvTrueFalse() throws Exception {
        Assert.assertEquals(_false.toString().intern(),op2.getEqv().toString().intern());

    }
    @Test
    public void getEqvTrueNone() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op3.getEqv().toString().intern());

    }
    @Test
    public void getEqvFalseTrue() throws Exception {
        Assert.assertEquals(_false.toString().intern(),op4.getEqv().toString().intern());

    }
    @Test
    public void getEqvFalseFalse() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op5.getEqv().toString().intern());

    }
    @Test
    public void getEqvFalseNone() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op6.getEqv().toString().intern());

    }
    @Test
    public void getEqvNoneTrue() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op7.getEqv().toString().intern());

    }
    @Test
    public void getEqvNoneFalse() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op8.getEqv().toString().intern());
    }
    @Test
    public void getEqvNoneNone() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op9.getEqv().toString().intern());
    }


    @Test
    public void getSheferTrueTrue() throws Exception {
        Assert.assertEquals(_false.toString().intern(),op1.getShefer().toString().intern());

    }
    @Test
    public void getSheferTrueFalse() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op2.getShefer().toString().intern());

    }
    @Test
    public void getSheferTrueNone() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op3.getShefer().toString().intern());

    }
    @Test
    public void getSheferFalseTrue() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op4.getShefer().toString().intern());

    }
    @Test
    public void getSheferFalseFalse() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op5.getShefer().toString().intern());

    }
    @Test
    public void getSheferFalseNone() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op6.getShefer().toString().intern());

    }
    @Test
    public void getSheferNoneTrue() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op7.getShefer().toString().intern());

    }
    @Test
    public void getSheferNoneFalse() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op8.getShefer().toString().intern());

    }
    @Test
    public void getSheferNoneNone() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op9.getShefer().toString().intern());
    }

    @Test
    public void getPirsTrueTrue() throws Exception {
        Assert.assertEquals(_false.toString().intern(),op1.getPirs().toString().intern());

    }
    @Test
    public void getPirsTrueFalse() throws Exception {
        Assert.assertEquals(_false.toString().intern(),op2.getPirs().toString().intern());

    }
    @Test
    public void getPirsTrueNone() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op3.getPirs().toString().intern());

    }
    @Test
    public void getPirsFalseTrue() throws Exception {
        Assert.assertEquals(_false.toString().intern(),op4.getPirs().toString().intern());

    }
    @Test
    public void getPirsFalseFalse() throws Exception {
        Assert.assertEquals(_true.toString().intern(),op5.getPirs().toString().intern());

    }
    @Test
    public void getPirsFalseNone() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op6.getPirs().toString().intern());

    }
    @Test
    public void getPirsNoneTrue() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op7.getPirs().toString().intern());

    }
    @Test
    public void getPirsNoneFalse() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op8.getPirs().toString().intern());

    }
    @Test
    public void getPirsNoneNone() throws Exception {
        Assert.assertEquals(_none.toString().intern(),op9.getPirs().toString().intern());
    }

}