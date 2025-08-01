package gui.okkit;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ExamenFrame extends JFrame {
	public ExamenFrame() {
		setTitle("Examen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 480);
        setLocationRelativeTo(null);
        setContentPane(new HauptPanel());
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new ExamenFrame().setVisible(true));
	}
}
