import javax.swing.*;
import java.awt.Font;

public class Exercise2 {
    public static void main(String[] args) {

        float yards, inches;
        int i=0;

        JTextArea textArea = new JTextArea(15, 30);
        Font textAreaFont = new Font("monospaced", Font.PLAIN, 12);

        textArea.setFont(textAreaFont);
        textArea.setText(String.format("%-10s%-10s\n%-10s%-5s\n", "Yards", "Inches", "-----", "------"));

        while( i <= 9)
        {
            yards = i + 1;
            inches = (i + 1) * 36;
            i++;

            textArea.append(String.format("%-10s%-15s\n", yards, inches));
        }
        JOptionPane.showMessageDialog(null,textArea,"Text Area - Results",JOptionPane.INFORMATION_MESSAGE);
    }
}





