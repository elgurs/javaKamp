package sayiAsalMi;

public class Main {

	public static void main(String[] args) {
		int sayi=7;


		if(sayi<=1) {
			System.out.println("Sayı asal değil.");
			return;
		} 

		boolean isPrime=true;

		for(int i=2;i<sayi;i++) {
			
			if(sayi%i==0){
			isPrime=false;
			}
					

		}if(isPrime) {
			System.out.println("asal");
		}
		else {
			System.out.println("asal değil");
		}

	}

}
