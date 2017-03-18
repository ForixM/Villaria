package fr.forix.Villaria;

import java.awt.Color;
import javax.swing.*;

public class IniMenuOptions {

    private JTabbedPane onglet;
    private JButton quit;
    public static JFrame f = new JFrame();
    
    public IniMenuOptions(){
        f.setSize(500, 300);
        f.setTitle("Menu Pause");
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setUndecorated(true);
        f.getContentPane().setLayout(null);
        f.getContentPane().setBackground(Color.GREEN);

        MenuOptions[] tPan = {new MenuOptions(Color.GRAY)};

        onglet = new JTabbedPane();
        int i = 0;
        for(MenuOptions pan : tPan){
            onglet.add("Résolution", pan);
            onglet.setBounds(0, 40, 500, 260);
            f.getContentPane().add(onglet);
        }
        quit = new JButton();
        quit.setIcon(new ImageIcon("C:\\Mehdi\\Montage Vidéo-Image-Son\\Images\\quit.jpg"));
        quit.setBounds(465, 5, 30, 30);
        quit.addActionListener(new quitL());
        f.getContentPane().add(quit);
    }
}

