import javax.swing.*;
import java.awt.Font;

public class Exercise3 {
    public static void main(String[] args) {

        String name, lengthAsString, breadthAsString, costPSMAsString;
        float length, breadth, costPSM, totalArea, totalCost;

        name = JOptionPane.showInputDialog("1. Please enter your name: ");
        lengthAsString = JOptionPane.showInputDialog("2. Enter the length of room: ");
        breadthAsString = JOptionPane.showInputDialog("3. Enter the breadth of room: ");
        costPSMAsString = JOptionPane.showInputDialog("4. Enter the cost per square metre of carpet: ");

        length = Float.parseFloat(lengthAsString);
        breadth = Float.parseFloat(breadthAsString);
        costPSM = Float.parseFloat(costPSMAsString);

        totalArea = length * breadth;
        totalCost = totalArea * costPSM;

        JTextArea textArea = new JTextArea(15, 55);
        Font textAreaFont = new Font("monospaced",Font.PLAIN, 12);

        textArea.setFont(textAreaFont);
        textArea.setText(String.format("%-20s%.2f m.\n%-20s%.2f m.\n%-20s%.2f sq. m.\n%-20s%.2f euro\n%-20s%.2f euro",
                                       "Length of room: ",length, "Breadth of room: ",breadth, "Total area of the room: ",totalArea,
                                        "Cost per square metre of carpet: ",costPSM, "Total cost of carpet: ",totalCost));

        JOptionPane.showMessageDialog(null,textArea,"Quotation for " + name,JOptionPane.INFORMATION_MESSAGE);
    }
}





