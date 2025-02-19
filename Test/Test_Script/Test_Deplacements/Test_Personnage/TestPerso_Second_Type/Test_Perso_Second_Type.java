
public class Test_Perso_Second_Type {
	public static void main(String[] args) {
		
		Perso_Second_Type j2 = New Perso_Second_Type();
		Perso_Second_Type j3 = New Perso_Second_Type("Oscar");
		Perso_Second_Type j4 = New Perso_Second_Type("Oliver", 5, 6);
		Perso_Second_Type j5 = New Perso_Second_Type("Marcus", 10, -9, "J'ai besoin d'argent..");
		System.out.println(j3.toString());
		System.out.println(j4.toString());
		System.out.println(j5.toString());
		System.out.println(j2.getXPerso());
		System.out.println(j2.getYPerso());
		System.out.println(j2.getNom());
		j2.setxPerso(8);
		j2.setyPerso(5);
	}
}
