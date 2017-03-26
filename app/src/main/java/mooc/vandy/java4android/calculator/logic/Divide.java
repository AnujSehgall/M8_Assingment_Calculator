package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here

    private int arga = 0;
    private int argb = 0;

    public Divide(int argumentOne, int argumentTwo) {
        arga = argumentOne;
        argb = argumentTwo;
    }

    public String toString() {

        if (argb==0){
            return "Divide by Zero is not Possible";
        }
        else {

            return String.valueOf(arga / argb) + " R:" + String.valueOf(arga % argb);
        }

    }
}
