package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO -- start your code here

    private int arga = 0;
    private int argb = 0;

    public Subtract(int argumentOne, int argumentTwo) {
        arga = argumentOne;
        argb = argumentTwo;
    }

    public String toString() {
        return String.valueOf(arga - argb);

    }
}
