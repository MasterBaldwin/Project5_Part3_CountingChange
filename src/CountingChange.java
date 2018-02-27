import javax.swing.*;

public class CountingChange {
private static JPanel panel;
private static JTextField numOfDimesText, numOfNicklesText, numOfPenniesText;

public static void main(String[] args) {
    int value;

    value = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number between 0 and 99 (both inclusive):"));
    if (value < 0 || value > 99) {
        JOptionPane.showMessageDialog(null, "You failed to follow simple instructions, good job.");
        return;
    }

    panel = new JPanel();
    numOfDimesText = new JTextField(3);
    numOfNicklesText = new JTextField(3);
    numOfPenniesText = new JTextField(3);

    panel.add(new JLabel("Number of Dimes:"));
    panel.add(numOfDimesText);
    panel.add(new JLabel("Number of Nickles:"));
    panel.add(numOfNicklesText);
    panel.add(new JLabel("Number of Pennies:"));
    panel.add(numOfPenniesText);

    for (int i = 0; i < 2; i++) {
        if (GetCoins() == value) {
            JOptionPane.showMessageDialog(null, "Yes");
            return;
        }
        JOptionPane.showMessageDialog(null, "No");
    }
}

private static int GetCoins() {
    int confirmCode, numOfDimes, numOfNickles, numOfPennies;

    numOfDimesText.setText("");
    numOfNicklesText.setText("");
    numOfPenniesText.setText("");
    confirmCode = JOptionPane.showConfirmDialog(null, panel, "Counting Change", JOptionPane.DEFAULT_OPTION);
    if (confirmCode == JOptionPane.OK_OPTION) {
        numOfDimes = Integer.parseInt(numOfDimesText.getText());
        numOfNickles = Integer.parseInt(numOfNicklesText.getText());
        numOfPennies = Integer.parseInt(numOfPenniesText.getText());
        return numOfDimes * 10 + numOfNickles * 5 + numOfPennies;
    }

    return 0;
}
}
