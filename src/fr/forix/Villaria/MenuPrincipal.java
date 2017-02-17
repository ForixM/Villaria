package fr.forix.Villaria;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class MenuPrincipal {

    public static JFrame f = new JFrame();
    private JPanel container = new JPanel();
    private JButton Jouer = new JButton("Jouer");
    private JButton Quitter = new JButton("Quitter");
    private JButton Options = new JButton("Options");
    private JLabel bc = new JLabel();
    private JLabel jeu = new JLabel("Villaria");
    private JTextField test = new JTextField();

    public MenuPrincipal(){
        f.setSize(495,339);
        f.setLocationRelativeTo(null);
        f.setTitle("Villaria");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bc.setIcon(new ImageIcon("C:/Users/Czapl/Desktop/tumblr_static_filename_640_v2.gif"));

        container.setLayout(null);

        Font police = new Font("Dark", Font.BOLD, 80);

        jeu.setFont(police);
        jeu.setForeground(Color.RED);
        jeu.setBounds(0, 20, 720, 80);
        jeu.setHorizontalAlignment(JLabel.CENTER);
        container.add(jeu);

        Jouer.setBounds(190, 200, 150, 75);
        container.add(Jouer);

        Options.setBounds(390, 200, 150, 75);
        container.add(Options);

        Quitter.setBounds(285, 300, 150, 75);
        container.add(Quitter);

        bc.setBounds(0, 0, 480, 300);
        container.add(bc);

        Jouer.addActionListener(new JouerL());
        Quitter.addActionListener(new QuitterL());
        Options.addActionListener(new OptionsL());
        test.addKeyListener(new TestL());

        f.setContentPane(container);
        f.setVisible(true);

    }

    class TestL implements KeyListener{
        public void keyPressed(KeyEvent e) {
            System.out.println("Code touche pressée : " + e.getKeyCode() + " - caractère touche pressée : " + e.getKeyChar());
        }

        public void keyReleased(KeyEvent e) {
            System.out.println("Code touche relâchée : " + e.getKeyCode() + " - caractère touche relâchée : " + e.getKeyChar());
        }

        public void keyTyped(KeyEvent e) {
            System.out.println("Code touche tapée : " + e.getKeyCode() + " - caractère touche tapée : " + e.getKeyChar());
        }
    }

    class JouerL implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent arg0) {
            FenetreDuJeu jeu = new FenetreDuJeu();
            MenuPrincipal.f.setVisible(false);

        }

    }

    class QuitterL implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent arg0) {
            System.exit(0);

        }

    }

    class OptionsL implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            IniMenuOptions mp = new IniMenuOptions();

        }

    }

}
