import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverterGUI extends JFrame {
    private JPanel mainPanel;
    private JTextField celsiusTextField;
    private JLabel celsiusLabel;
    private JButton converterButton;
    private JLabel fahrenheitLabel;

    public CelsiusConverterGUI(String appName){
        super(appName);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        converterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // get the text from the celsiusTextField
                // convert to double
                // update the fahrenheitLabel
                int tempFahr = (int)((Double.parseDouble(celsiusTextField.getText()))
                        * 1.8 + 32);
                fahrenheitLabel.setText(String.valueOf(tempFahr + " fahrenheit"));
            }
        });
    }

    public static void main(String[] args) {
        JFrame jFrame = new CelsiusConverterGUI("Mio Convertitore Celsius");
        jFrame.setVisible(true);
    }
}
