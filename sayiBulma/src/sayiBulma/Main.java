package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 3, 4, 5, 6, 0 };
		int aranacak = 8;
		boolean varMi = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			System.out.println("Sayı mevcuttur.");
		} else {
			System.out.println("Sayı mevcut değil.");
		}

	}

}
