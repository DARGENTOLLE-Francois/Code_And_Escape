package Personnage;

public class Test_Main_Personnage {
public static void main(String[] args) {
		Main_Personnage j1 = new Main_Personnage();
	
		System.out.println(j1.getXPerso());
		System.out.println(j1.getYPerso());
		System.out.println(j1.getNom());
		j1.setxPerso(8);
		j1.setyPerso(5);
		j1.deplacerPersonnage('q');
		j1.deplacerPersonnage('Z');
		System.out.println(j1.getXPerso());
		System.out.println(j1.getYPerso());
	}
}