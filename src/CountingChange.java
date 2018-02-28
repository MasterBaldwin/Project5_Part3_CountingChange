import javax.swing.*;

public class CountingChange {
// Written by: Mike Baldwin
// Project 5 - Part 3 - Counting Change
// Allows the user to attempt the calculation of a user-determined monetary value with
// dimes, nickles, and pennies

private static JPanel panel;
private static JTextField numOfDimesText, numOfNicklesText, numOfPenniesText;

public static void main(String[] args) {
    int value;

    value = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number " +
            "between 0 and 99 (both inclusive):"));
    if (value < 0 || value > 99) {
        JOptionPane.showMessageDialog(null, "You failed to follow simple " +
                "instructions...");
        return;
    }

    panel = new JPanel();
    numOfDimesText = new JTextField(3);
    numOfNicklesText = new JTextField(3);
    numOfPenniesText = new JTextField(3);

    panel.add(new JLabel("Number of Dimes:"));   panel.add(numOfDimesText);
    panel.add(new JLabel("Number of Nickles:")); panel.add(numOfNicklesText);
    panel.add(new JLabel("Number of Pennies:")); panel.add(numOfPenniesText);

    for (int i = 0; i < 2; i++) {
        if (getCoins() == value) {
            JOptionPane.showMessageDialog(null, "Yes");
            return;
        }
        JOptionPane.showMessageDialog(null, "No");
    }
}

private static int getCoins() {
    int numOfDimes, numOfNickles, numOfPennies;

    numOfDimesText.setText("0");
    numOfNicklesText.setText("0");
    numOfPenniesText.setText("0");
    JOptionPane.showConfirmDialog(null, panel, "Counting Change", JOptionPane.DEFAULT_OPTION);
    numOfDimes = Integer.parseInt(numOfDimesText.getText());
    numOfNickles = Integer.parseInt(numOfNicklesText.getText());
    numOfPennies = Integer.parseInt(numOfPenniesText.getText());
    return numOfDimes * 10 + numOfNickles * 5 + numOfPennies;
}
}
