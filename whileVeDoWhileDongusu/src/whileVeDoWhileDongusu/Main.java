package whileVeDoWhileDongusu;

public class Main {

	public static void main(String[] args) {
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}

		System.out.println("While Döngüsü Bitti.");

		int j = 300;

		do {
			System.out.println(j);
			j += 2;

		} while (j < 30);
		System.out.println("Do While Döngüsü Bitti.");

	}

}
