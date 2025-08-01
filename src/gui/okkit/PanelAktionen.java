package gui.okkit;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAktionen extends JPanel {
    JButton btnLoeschen, btnSpeichern, btnNeuesThema;
    JTextField messageArea;

    public PanelAktionen() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(7, 7, 7, 7);

        // Message-Area
        messageArea = new JTextField();
        messageArea.setEditable(false);
        messageArea.setText("Message area");
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 3; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.weightx = 1.0;
        add(messageArea, gbc);

        // Buttons
        btnLoeschen = new JButton("Thema Löschen");
        btnSpeichern = new JButton("Speichern");
        btnNeuesThema = new JButton("Neues Thema");
        gbc.gridwidth = 1; gbc.gridy = 1; gbc.fill = GridBagConstraints.NONE; gbc.weightx = 0.0;

        gbc.gridx = 0;
        add(btnLoeschen, gbc);

        gbc.gridx = 1;
        add(btnSpeichern, gbc);

        gbc.gridx = 2;
        add(btnNeuesThema, gbc);
    }
}


