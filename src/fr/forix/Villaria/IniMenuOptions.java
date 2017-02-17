package fr.forix.Villaria;

import java.awt.Color;
import javax.swing.*;

public class IniMenuOptions extends JFrame {

    private JTabbedPane onglet;

    public IniMenuOptions(){
        this.setSize(500, 300);
        this.setTitle("Menu Pause");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Création de plusieurs Panneau
        MenuOptions[] tPan = {new MenuOptions(Color.GRAY)};

        //Création de notre conteneur d'onglets
        onglet = new JTabbedPane();
        int i = 0;
        for(MenuOptions pan : tPan){
            //Méthode d'ajout d'onglet
            onglet.add("Résolution", pan);
            //Vous pouvez aussi utiliser la méthode addTab
            //onglet.addTab("Onglet n° "+(++i), pan);


            this.getContentPane().add(onglet);
            this.setVisible(true);
        }

    }
}

