import javax.swing.*;
import java.awt.*;

public class Exercise6 {
    public static void main(String[] args) {

        int number, cube, i=0;

        JTextArea textArea = new JTextArea(15, 30);
        Font textAreaFont = new Font("monospaced", Font.PLAIN, 12);

        textArea.setFont(textAreaFont);
        textArea.setText(String.format("%-10s%-10s\n%-10s%-5s\n", "Number", "Cube", "------", "----"));

        while( i <= 14)
        {
            number = i + 1;
            cube = (i + 1);
            i++;

            textArea.append(String.format("%-10s%-15s\n", number, cube));
        }
        JOptionPane.showMessageDialog(null,textArea,"Text Area - Results",JOptionPane.INFORMATION_MESSAGE);
    }

    public static int cube(int c)
    {
        int i=0, n;
        n = i + 1;
        c = (i + 1);
        return i++;
    }
}
