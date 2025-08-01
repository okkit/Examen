package gui.okkit;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

public class HauptPanel extends JPanel {
	public HauptPanel() {
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		// Linkes Panel
		gbc.gridx = 0; // Spalte 0. x, weil Spalten werden entlang der X-Achse gezähl
		gbc.gridy = 0; // Zeile 0. y, weil Zeilen werden entlang der Y-Achse gezähl
		gbc.weightx = 1.0; // Via Experimen eingestellt
		gbc.weighty = 1.0; // Via Experimen eingestellt
		gbc.insets = new Insets(15, 10, 0, 5);
		gbc.fill = GridBagConstraints.BOTH; // Falls in einer Zelle zu viel Platz, stretche den
											// Inhalt
		add(new PanelNeuesThema(), gbc);

		// Rechtes Panel
		gbc.gridx = 1;
//		gbc.weightx = 1.0; // Überflüssig
		gbc.insets = new Insets(15, 5, 0, 10);
		add(new PanelThemenListe(), gbc);

		// Unteres Panel
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2; // weil in der ersten Zeile zwei Spalten sind, "ziehen" wir die zweite
							// Zeile über zwei Spalten
//		gbc.weightx = 1.0; // Überflüssig
		gbc.weighty = 0.0; // Ohne ensteht ein leeres Plats zwischen den oberen Pannel und dem unteren
		gbc.insets = new Insets(5, 10, 10, 10);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(new PanelAktionen(), gbc);
	}
}
