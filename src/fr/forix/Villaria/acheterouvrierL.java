package fr.forix.Villaria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Czapl on 17/03/2017.
 */
public class acheterouvrierL implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (FenetreDuJeu.diamants >= 10){
            FenetreDuJeu.diamants -= 10;
            FenetreDuJeu.ouvriers += 1;
            FenetreDuJeu.ouvriermax += 1;
            FenetreDuJeu.diamantL.setText("Diamants: "+FenetreDuJeu.diamants);
            FenetreDuJeu.Louvriers.setText("Ouvriers disponibles: "+FenetreDuJeu.ouvriers);
        } else{
            JOptionPane jop3 = new JOptionPane();
            ImageIcon img = new ImageIcon("finance-634901_960_720.png");
            jop3.showMessageDialog(null, "Vous n'avez pas assez de diamants pour pouvoir acheter un ouvrier en plus !", "Pas assez de diamants", JOptionPane.ERROR_MESSAGE, img);
        }
    }
}
