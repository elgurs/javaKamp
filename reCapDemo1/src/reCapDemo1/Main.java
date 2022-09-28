package reCapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 80;
		int sayi2 = 25;
		int sayi3 = 10;
		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}

		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}

		System.err.println("En Büyük =" + enBuyuk);

	}

}
