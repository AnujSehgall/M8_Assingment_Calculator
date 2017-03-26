package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    // TODO -- start your code here

    private int arga = 0;
    private int argb = 0;

    public Add(int argumentOne, int argumentTwo) {
        arga = argumentOne;
        argb = argumentTwo;
    }

    public String toString() {
        return String.valueOf(arga + argb);
    }

}
