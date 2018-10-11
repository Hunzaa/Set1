import javax.swing.*;

public class Exercise4 {
    public static void main(String[] args) {

        String name;
        int words=0, noOfCharacters;
        char firstInitial;

        name = JOptionPane.showInputDialog("Please enter your full name: ");

        // No. of Characters
        for(int i=0; i<name.length(); i++)
            if(name.charAt(i) == ' ')
                words ++;
        noOfCharacters = words + 1;

        //Initial of Firstname
        firstInitial = name.charAt(0);

        //Full name is UPPERCASE...
        //Surname...

        JOptionPane.showMessageDialog(null,"No. of characters: " + noOfCharacters +
                                                                    "\nFirst Initial: " +  firstInitial +
                                                                    "\nName in Uppercase: " +  name.toUpperCase() +
                                                                    "\nSurname: " +  name.substring(name.lastIndexOf(' ')),
                                                               "Results", JOptionPane.INFORMATION_MESSAGE);
    }
}