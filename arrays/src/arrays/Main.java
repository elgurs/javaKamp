package arrays;

public class Main {

	public static void main(String[] args) {
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Ayşe";
		ogrenciler[1] = "Aleyna";
		ogrenciler[2] = "Dila";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		System.out.println("--");

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	

	}

}
