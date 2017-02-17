package fr.forix.Villaria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import javax.swing.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MenuPause {
    
    public static JFrame f = new JFrame();

    private JPanel container = new JPanel();

    private JButton options = new JButton("Options");
    private JButton retourjeu = new JButton("Retour au Jeu");
    private JButton menup = new JButton("Menu Principal");
    private JButton sauvegarder = new JButton("Sauvegarder");
    private JButton charger = new JButton("Charger une partie");

    public MenuPause() {
        f.setSize(480, 280);
        f.setTitle("Pause");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        container.setLayout(null);

        sauvegarder.setBounds(230, 5, 200, 100);
        container.add(sauvegarder);

        options.setBounds(20, 5, 200, 100);
        container.add(options);

        retourjeu.setBounds(20, 130, 200, 100);
        container.add(retourjeu);

        menup.setBounds(230, 130, 200, 100);

        charger.setBounds(230, 130, 200, 100);
        container.add(charger);

        options.addActionListener(new optionsL());
        retourjeu.addActionListener(new retourL());
        menup.addActionListener(new menup());
        sauvegarder.addActionListener(new sauvegarderL());
        charger.addActionListener(new chargerL());

        f.setContentPane(container);
        f.setVisible(true);
    }

    class chargerL implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent arg0) {
            Charger c = new Charger();

        }
    }

    class sauvegarderL implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent arg0) {
            Sauvegarde s = new Sauvegarde();
        }
    }

    class optionsL implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            IniMenuOptions r = new IniMenuOptions();
            MenuPause.f.setVisible(false);
        }
    }

    class retourL implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            FenetreDuJeu.PauseIsOn = false;
            MenuPause.f.setVisible(false);
        }
    }

    class menup implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            FenetreDuJeu.f.setVisible(false);
            MenuPrincipal.f.setVisible(true);
            MenuPause.f.setVisible(false);
        }
    }

}
