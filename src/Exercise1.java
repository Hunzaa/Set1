import javax.swing.*;

public class Exercise1 {
    public static void main(String[] args) {

        String GBAsString;
        float GB, euro=0;

        GBAsString = JOptionPane.showInputDialog("Please enter an exchange rate in GB: ");
        GB = Float.parseFloat(GBAsString);

        while(GB != (0))
        {
            euro = GB * 1.12304f;

            JOptionPane.showMessageDialog(null,"\nGB: " + String.format("%.2f \u00a3", GB) +
                            "\n\nEuro: " + String.format("%.2f \u20ac", euro),"Results", JOptionPane.INFORMATION_MESSAGE);

            GBAsString = JOptionPane.showInputDialog("Please enter an exchange rate in GB: ");
            GB = Float.parseFloat(GBAsString);
        }
    }
}
