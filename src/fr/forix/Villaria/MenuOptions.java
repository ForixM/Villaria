package fr.forix.Villaria;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuOptions extends JPanel{
    private Color color = Color.white;
    private static int COUNT = 0;
    private String message = "";
    private JLabel bruh = new JLabel("Résolution");
    private JComboBox combo = new JComboBox();

    public MenuOptions(Color color){
        this.color = color;
        this.add(bruh);

        String[] tab = {"1920 x 1080", "1366 x 758", "1280 x 720", "1080 x 620", "740 x 480"};
        combo = new JComboBox(tab);
        combo.addActionListener(new comboL());
        this.add(combo);
    }
    public void paintComponent(Graphics g){
        g.setColor(this.color);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.BOLD, 15));
        g.drawString(this.message, 10, 20);
    }

    class comboL implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if(combo.getSelectedItem() == "1920 x 1080"){
                MenuPrincipal.f.setSize(1920, 1080);
                FenetreDuJeu.f.setSize(1920, 1080);
            }

            if(combo.getSelectedItem() == "1366 x 758"){
                MenuPrincipal.f.setSize(1366, 758);
                FenetreDuJeu.f.setSize(1366, 758);
            }

            if(combo.getSelectedItem() == "1280 x 720"){
                MenuPrincipal.f.setSize(1280, 720);
                FenetreDuJeu.f.setSize(1280, 720);
            }

            if(combo.getSelectedItem() == "1080 x 620"){
                MenuPrincipal.f.setSize(1080, 620);
                FenetreDuJeu.f.setSize(1080, 620);
            }

            if (combo.getSelectedItem() == "740 x 480"){
                MenuPrincipal.f.setSize(740, 480);
                FenetreDuJeu.f.setSize(740, 480);
            }
        }
    }





}