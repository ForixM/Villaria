package fr.forix.Villaria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Czapl on 01/02/2017.
 */
public class MenuBasDuJeu extends JPanel{
    private Color color = Color.white;
    private static int COUNT = 0;
    private String message = "";
    private JComboBox combo = new JComboBox();

    public MenuBasDuJeu(Color color){
        this.color = color;
        ++COUNT;
        if (COUNT == 2) {
            this.add(FenetreDuJeu.combo3);
            this.add(FenetreDuJeu.combo4);
        }
        if (COUNT == 1){
            this.add(FenetreDuJeu.combo);
            this.add(FenetreDuJeu.combo2);
        }
    }

    public void paintComponent(Graphics g){
        g.setColor(this.color);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.BOLD, 15));
        g.drawString(this.message, 10, 20);
    }
}
