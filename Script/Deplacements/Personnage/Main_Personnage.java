package Personnage;

public class Main_Personnage {
	
	private String nom;
	private int xPerso;
    private int yPerso;
    private String[] inventaire;
    
	public Main_Personnage() {
		super();
		this.nom = "Cosma";
		this.xPerso = 0;
		this.yPerso = 0;
	}
    
	public int getXPerso() {
        
        return this.xPerso;
    }
     
    public int getYPerso() {
         
        return this.yPerso;
    }

	public void setxPerso(int xPerso) {
		this.xPerso = xPerso;
	}

	public void setyPerso(int yPerso) {
		this.yPerso = yPerso;
	}

	public String getNom() {
		return nom;
	}
    
	 public void deplacerPersonnage(char direction) {
         
	        switch(direction) {
	         
	         /*Haut*/
	        case 'Z':
	             
	            this.xPerso++;
	             
	            break;
	             
	        case 'z':
	             
	            this.xPerso++;
	             
	            break; 
	            
	        // Bas
	        case 'S':
	             
	            this.xPerso--;
	             
	            break;
	           
	        case 's':
	             
	            this.xPerso--;
	             
	            break;
	            
	        // Gauche
	        case 'Q':
	             
	            this.yPerso++;
	             
	            break;
	             
	        case 'q':
	             
	            this.yPerso++;
	             
	            break;
	            
	        // Droite
	        case 'D':
	             
	            this.yPerso--;
	             
	            break;
	             
	        case 'd':
	             
	            this.yPerso--;
	             
	            break;
	            
	            default:
	                 
	                System.out.println("Ceci n'est pas une direction valide. Ré-essaye encore !!");
	 }
	        
    
	public String[] Recup_Dans_Inventaire(String objet) {
		this.inventaire[0] = objet;
	}
	
	public String Enlever_de_Inventaire(String[] objet){
		this.inventaire.remove(inventaire[0]);
		return inventaire[0];
	}
  }


}
