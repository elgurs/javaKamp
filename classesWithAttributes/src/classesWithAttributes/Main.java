package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product=new Product();
		product.set_name("laptop");
		product.setId(1);
		product.set_description("asus laptop");
		product.set_price(5000);
		product.set_stockAmount(3);
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		System.out.println(product.get_kod());
		

	}

}
