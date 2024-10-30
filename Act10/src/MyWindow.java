import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyWindow {
    private JPanel MiPanel;
    private JTextField Numero1text;
    private JTextField Numero2text;
    private JButton MainButton;
    private JLabel Numero1;
    private JLabel Numero2;

    public MyWindow() {
        MainButton.addActionListener(e -> {
            try {
                double numero1 = Double.parseDouble(Numero1text.getText());
                double numero2 = Double.parseDouble(Numero2text.getText());
                String resultado = String.format(
                        "Suma: %.2f\nResta: %.2f\nMultiplicación: %.2f\nDivisión: %s",
                        numero1 + numero2,
                        numero1 - numero2,
                        numero1 * numero2,
                        numero2 != 0 ? String.format("%.2f", numero1 / numero2) : "No se puede dividir entre cero"
                );
                JOptionPane.showMessageDialog(null, resultado);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos");
            }
        });
        Numero1text.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Numero1text.setBackground(Color.YELLOW);
            }
        });
        Numero1text.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                Numero1text.setBackground(Color.WHITE);
            }
        });
        Numero2text.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Numero2text.setBackground(Color.YELLOW);
            }
        });

        Numero2text.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                Numero2text.setBackground(Color.WHITE);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora Básica");
        frame.setContentPane(new MyWindow().MiPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
