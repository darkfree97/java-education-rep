package sample;

/**
 * Created by Darkfree on 08.11.2016.
 */
public class Memory {
    private Operand value;

    public Memory() {
        this.value = null;
    }

    public Memory(Operand value) {
        this.value = value;
    }

    public Operand getValue() {
        return value;
    }

    public void setValue(Operand value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.getValue();
    }
}
