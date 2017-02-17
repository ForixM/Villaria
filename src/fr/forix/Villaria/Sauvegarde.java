package fr.forix.Villaria;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class Sauvegarde {

    public Sauvegarde() {
        JSONObject obj = new JSONObject();

        obj.put("heure", FenetreDuJeu.heure);
        obj.put("minute", FenetreDuJeu.minute);
        obj.put("jour", FenetreDuJeu.jour);
        obj.put("argent", FenetreDuJeu.argent);
        obj.put("CC", FenetreDuJeu.CC);
        obj.put("CCr", FenetreDuJeu.CCr);
        obj.put("centralecharbon", FenetreDuJeu.centralecharbon);
        obj.put("centralefioul", FenetreDuJeu.centralefioul);
        obj.put("centralenucleaire", FenetreDuJeu.centralenucleaire);
        obj.put("chateau", FenetreDuJeu.chateau);
        obj.put("ferme", FenetreDuJeu.ferme);
        obj.put("habitants", FenetreDuJeu.habitants);
        obj.put("immeubler", FenetreDuJeu.immeubler);
        obj.put("immeubles", FenetreDuJeu.immeubles);
        obj.put("industrier", FenetreDuJeu.industrier);
        obj.put("industries", FenetreDuJeu.industries);
        obj.put("magasinr", FenetreDuJeu.magasinr);
        obj.put("magasins", FenetreDuJeu.magasins);
        obj.put("maisonr", FenetreDuJeu.maisonr);
        obj.put("maisons", FenetreDuJeu.maisons);
        obj.put("nourriture", FenetreDuJeu.nourriture);
        obj.put("parceolien", FenetreDuJeu.parceolien);
        obj.put("parcsolaire", FenetreDuJeu.parcsolaire);
        obj.put("rCC", FenetreDuJeu.rCC);
        obj.put("revenustot", FenetreDuJeu.revenustot);
        obj.put("rimmeuble", FenetreDuJeu.rimmeuble);
        obj.put("rindustrie", FenetreDuJeu.rindustrie);
        obj.put("rmagasin", FenetreDuJeu.rmagasin);
        obj.put("rmaison", FenetreDuJeu.rmaison);
        obj.put("STG", FenetreDuJeu.STG);
        obj.put("STP", FenetreDuJeu.STP);

        try {
            FileWriter file = new FileWriter("C:/Games/Villaria/sauvegardes/partie1.json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
