package gui.okkit;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PanelThemenListe extends JPanel {
    JList<String> themenListe;

    public PanelThemenListe() {
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createTitledBorder("Themen"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0; gbc.gridy = 0; gbc.weightx = 1.0; gbc.weighty = 1.0;

        String[] themen = {
                "Titel des Themas 1", "Titel des Themas 2", "Titel des Themas 3",
                "Titel des Themas 4", "Titel des Themas 5", "Titel des Themas 6",
                "Titel des Themas 7", "Titel des Themas 8", "Titel des Themas 9",
                "Titel des Themas 10"
        };

        themenListe = new JList<>(themen);
        themenListe.setFont(new Font("Serif", Font.PLAIN, 15));
        JScrollPane scrollPane = new JScrollPane(themenListe);

        add(scrollPane, gbc);
    }
}

