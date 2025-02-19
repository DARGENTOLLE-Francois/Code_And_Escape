
package Personnage;

public class Perso_Second_Type {
	private String nom;
	private int xPersoSecond;
    private int yPersoSecond;
    private String demande;
    private bool reponseDemande;
    
    public Perso_Second_Type() {
    	nom = "Zorg";
    	xPersoSecond = 0; // a changer
    	yPersoSecond = 0; // a changer
    	demande = "Je cherche le sens de ma vie"; // a changer
    	reponsedemande = false;
    	
    }
    
    public Perso_Second_Type(String nom) {
    	this.nom = nom;
    	xPersoSecond = 0; // a changer 
    	yPersoSecond = 0; // a changer
    	demande = "Je cherche le sens de ma vie"; // a changer
    	reponsedemande = false;
    }
    
    public Perso_Second_Type(String nom, int xPersoSecond, int yPersoSecond) {
    	this.nom = nom;
    	this.xPersoSecond = xPersoSecond;  
    	this.yPersoSecond = yPersoSecond;
    	demande = "Je cherche le sens de ma vie"; // a changer
    	reponsedemande = false;
    }
    
    public Perso_Second_Type(String nom, int xPersoSecond, int yPersoSecond, String demande) {
    	this.nom = nom;
    	this.xPersoSecond = xPersoSecond; 
    	this.yPersoSecond = yPersoSecond; 
    	this.demande = demande;
    	reponsedemande = false;
    }
    
    public int getXPersoSecond() {
        return this.xPersoSecond;
    }

    public int getYPersoSecond() {
        return this.yPersoSecond;
    }

    public void setXPersoSecond(int xPersoSecond) {
        this.xPersoSecond = xPersoSecond;
    }

    public void setYPersoSecond(int yPersoSecond) {
        this.yPersoSecond = yPersoSecond;
    }

    public String getNom() {
        return nom;
    }
    
    public String setNom() {
    	this.nom = nom;
    }
    
    public String getDemande() {
    	return demande;
    }
    
    public void repondreDemande(String objet_resolvant_le_probleme) {
    	if (objet_resolvant_le_probleme.exist())
    		reponsedemande = true;
    	    return reponsedemande;
    	    System.out.println("Merci de m'avoir aidée !");
    	else
    		return reponsedemande;
    	    System.out.println("Ce n'est pas ce que je voulais...")
    		
    }
    
    public String toString() {
    	return "Perso_Second_Type[ nom =" + nom +", position x =" + xPersoSecond + ", position y =" + yPersoSecond+ ", demande ="+ demande +" ]";
    }
    
}

