package fr.forix.Villaria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Czapl on 18/03/2017.
 */
public class quitL implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        IniMenuOptions.f.setVisible(false);
    }
}
