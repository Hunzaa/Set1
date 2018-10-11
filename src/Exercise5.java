import javax.swing.*;

public class Exercise5 {
    public static void main(String[] args) {

        String aAsString, bAsString, cAsString;
        float a, b, c;
        double xPositive, xNegative;

        aAsString = JOptionPane.showInputDialog("1. Enter the value of 'a' : ");
        bAsString = JOptionPane.showInputDialog("2. Enter the value of 'b' : ");
        cAsString = JOptionPane.showInputDialog("3. Enter the value of 'c' : ");

        a = Integer.parseInt(aAsString);
        b = Integer.parseInt(bAsString);
        c = Integer.parseInt(cAsString);

        xPositive = (  (-1 * b) + Math.sqrt( (b * b) - ( 4 * (a * c) ) )  ) / (2 * a);
        xNegative = (  (-1 * b) - Math.sqrt( (b * b) - ( 4 * (a * c) ) )  ) / (2 * a);

        JOptionPane.showMessageDialog(null,"The values of 'x' are " + xPositive + " and " + xNegative + " respectively.",
                "RESULT",JOptionPane.INFORMATION_MESSAGE);
    }
}
