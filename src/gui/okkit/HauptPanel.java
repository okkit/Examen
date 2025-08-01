package gui.okkit;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

public class HauptPanel extends JPanel {

	// Wir brauchen später Zugriff auf die Panels. Daher müssen sie Feler sein
	PanelThemenListe panelThemenListe; // Deklaration des Feldes panelThemenListe
	PanelNeuesThema panelNeuesThema;
	PanelAktionen panelAktionen;

	/**
	 * Konstruktor.
	 */
	public HauptPanel() {
		super();
		initPanels();
		addPanels();
	}

	/**
	 * Initialisiert die Felder (also die Panels)
	 */
	void initPanels() {
		 panelThemenListe = new PanelThemenListe();
		 panelNeuesThema = new PanelNeuesThema();
		 panelAktionen = new PanelAktionen();
	}

	/**
	 * Fühgt die Panels hinzu (addet) inkl. Layout
	 */
	void addPanels() {
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		// Linkes Panel
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(15, 10, 0, 5);
		gbc.fill = GridBagConstraints.BOTH;
		add(panelNeuesThema, gbc);

		// Rechtes Panel
		gbc.gridx = 1;
		gbc.insets = new Insets(15, 5, 0, 10);
		add(panelThemenListe, gbc);

		// Unteres Panel
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.weighty = 0.0;
		gbc.insets = new Insets(5, 10, 10, 10);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(panelAktionen, gbc);
	}
}
