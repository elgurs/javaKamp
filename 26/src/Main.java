import javax.print.attribute.IntegerSyntax;

public class Main {

	public static void main(String[] args) {

	
		int toplam=topla2(2,3,4,5,6,7,8);
		System.out.println(toplam);
	}

	
	public static int topla2(int...sayilar) {
		int toplam=0;
		for(int sayi : sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}

	
	

	

}
