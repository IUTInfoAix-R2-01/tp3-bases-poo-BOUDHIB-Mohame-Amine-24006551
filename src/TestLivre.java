
public class TestLivre {

	public static void main(String[] args) {
		Livre L1 = new Livre("Les Mille et une nuits", 6.50, 11); 
		System.out.println(L1.toString());
		L1.setQuantite(10); // Un livre a été vendu
		System.out.println(L1.getQuantite());
	}

}
