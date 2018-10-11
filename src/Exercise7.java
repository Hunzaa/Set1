import javax.swing.*;

public class Exercise7 {
    public static void main(String[] args) {

        String numberAsString;
        int number;

        numberAsString = JOptionPane.showInputDialog("Please enter a number: ");
        number = Integer.parseInt(numberAsString);

        JOptionPane.showMessageDialog(null, isEven(number),"Result", JOptionPane.INFORMATION_MESSAGE);
    }

    public static String isEven(int n)
    {
        String x = "";

        if(n % 2 == 0)
            x = n + " is Even";
        else
            x = n + " is Odd";

        return x;
    }
}