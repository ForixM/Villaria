package fr.forix.Villaria;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Charger {
    public Charger(){
        charger();
    }

    public void charger(){
        JSONParser parser = new JSONParser();
        try{
            File f = new File("C:/Games/Villaria/sauvegardes/partie1.json");

            if (f.exists()) {

                Object obj = parser.parse(new FileReader("C:/Games/Villaria/sauvegardes/partie1.json"));
                JSONObject jsonobject = (JSONObject) obj;

                FenetreDuJeu.CCr = (Long) jsonobject.get("CCr");
                FenetreDuJeu.CC = (Long) jsonobject.get("CC");
                FenetreDuJeu.argent = (Long) jsonobject.get("argent");
                FenetreDuJeu.revenustot = (Long) jsonobject.get("revenustot");
                FenetreDuJeu.centralecharbon = (Long) jsonobject.get("centralecharbon");
                FenetreDuJeu.centralefioul = (Long) jsonobject.get("centralefioul");
                FenetreDuJeu.centralenucleaire = (Long) jsonobject.get("centralenucleaire");
                FenetreDuJeu.chateau = (Long) jsonobject.get("chateau");
                FenetreDuJeu.ferme = (Long) jsonobject.get("ferme");
                FenetreDuJeu.habitants = (Long) jsonobject.get("habitants");
                FenetreDuJeu.immeubler = (Long) jsonobject.get("immeubler");
                FenetreDuJeu.immeubles = (Long) jsonobject.get("immeubles");
                FenetreDuJeu.industrier = (Long) jsonobject.get("industrier");
                FenetreDuJeu.industries = (Long) jsonobject.get("industries");
                FenetreDuJeu.magasinr = (Long) jsonobject.get("magasinr");
                FenetreDuJeu.magasins = (Long) jsonobject.get("magasins");
                FenetreDuJeu.maisonr = (Long) jsonobject.get("maisonr");
                FenetreDuJeu.maisons = (Long) jsonobject.get("maisons");
                FenetreDuJeu.nourriture = (Long) jsonobject.get("nourriture");
                FenetreDuJeu.parceolien = (Long) jsonobject.get("parceolien");
                FenetreDuJeu.parcsolaire = (Long) jsonobject.get("parcsolaire");
                FenetreDuJeu.rCC = (Long) jsonobject.get("rCC");
                FenetreDuJeu.rimmeuble = (Long) jsonobject.get("rimmeuble");
                FenetreDuJeu.rindustrie = (Long) jsonobject.get("rindustrie");
                FenetreDuJeu.rmagasin = (Long) jsonobject.get("rmagasin");
                FenetreDuJeu.rmaison = (Long) jsonobject.get("rmaison");
                FenetreDuJeu.STG = (Long) jsonobject.get("STG");
                FenetreDuJeu.STP = (Long) jsonobject.get("STP");


            } else{
                JOptionPane jop3 = new JOptionPane();
                ImageIcon img = new ImageIcon("fr/forix/Villaria/ressources/logo-erreur.jpg");
                jop3.showMessageDialog(null, "Fichier de sauvegarde introuvable", "Erreur", JOptionPane.ERROR_MESSAGE, img);
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}
