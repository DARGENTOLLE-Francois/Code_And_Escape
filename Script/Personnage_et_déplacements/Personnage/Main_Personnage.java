package Personnage;

import java.util.ArrayList;
import java.util.List;

public class Main_Personnage {

    private String nom;
    private int xPerso;
    private int yPerso;
    private List<String> inventaire;

    public Main_Personnage() {
        this.nom = "Cosma";
        this.xPerso = 0;
        this.yPerso = 0;
        this.inventaire = new ArrayList<>();
    }

    public int getXPerso() {
        return this.xPerso;
    }

    public int getYPerso() {
        return this.yPerso;
    }

    public void setXPerso(int xPerso) {
        this.xPerso = xPerso;
    }

    public void setYPerso(int yPerso) {
        this.yPerso = yPerso;
    }

    public String getNom() {
        return nom;
    }

    public void deplacerPersonnage(char direction) {
        switch (direction) {
            case 'Z': // Haut
                this.yPerso++;
                break;
            case 'z': 
                this.yPerso++;
                break;
                
            case 'S': // Bas
                this.yPerso--;
                break;
            case 's': 
                this.yPerso--;
                break;
                
            case 'Q': // Gauche
                this.xPerso--;
                break;
            case 'q': 
                this.xPerso--;
                break;
                
            case 'D': // Droite
                this.xPerso++;
                break;
            case 'd': 
                this.xPerso++;
                break;
                
            default:
                System.out.println("Ceci n'est pas une direction valide. Ré-essaye encore !");
        }
    }

    public void ajouterDansInventaire(String objet) {
        this.inventaire.add(objet);
    }

    public String enleverDeInventaire() {
        if (!this.inventaire.isEmpty()) {
            return this.inventaire.remove(0);
        } else {
            System.out.println("L'inventaire est vide !");
            return null;
        }
    }
}
