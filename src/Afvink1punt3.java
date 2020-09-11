import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Afvink1punt3 extends JFrame implements ActionListener {

    private JTextField textField; //declaratie
    private JLabel label;
    private JButton button; //declareer
    private JPanel panel; //declaratie van een window om op te tekenen (1)

    public static void main(String[] args) {
        Afvink1punt3 frame = new Afvink1punt3();
        frame.setSize(500, 500);
        frame.createGUI();
        frame.setVisible(true);
    }
    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        label = new JLabel("Voer hier iets in");
        window.add(label);
        textField = new JTextField("geef hier input");  // initalisatie (instantiering)
        textField.setBackground(Color.yellow);
        button = new JButton("Klik op mij"); //instantie
        window.setBackground(Color.BLUE);
        window.add(textField);
        window.add(button);  // plaats button in window
        button.addActionListener(this); //koppel actionlistener
        //plaatsen van panel (2)
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(Color.CYAN);
        window.add(panel);
        //einde panel
    }
    /**
     * ActionListener voor een button, vergeet niet de implements ActionListener bij Class
     *
     * @param event dit is het object dat iets doet
     */
    public void actionPerformed(ActionEvent event) {
        // Teken een lijn op het panel (3)
        Graphics paper = panel.getGraphics(); // haal de referentie aan panel op
        paper.drawLine(10, 20, 50, 50);
        paper.setColor(Color.GREEN);
        paper.drawString(textField.getText(),70,80);
    }
}