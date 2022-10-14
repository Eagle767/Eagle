package access;
public class Shoe {
	interface ShoeMaking{
		Shoe make();
	}
	interface Export{
		Shoe export(); 
	}
	class ShoeFactory implements ShoeMaking , Export{
		 String name="Chennai";
		void getName() {
			System.out.println(name);
		}
		public Shoe make() {
			return new Shoe();
		}
		public Shoe export() {
			return new Shoe();
		}
	}
	interface SellShoe{
		Shoe sell();
	}
	class ShoeShop implements SellShoe{
		Customer c=new Customer();
		class SalesMan{
			
		}
		class SalesMan1{
			
		}
		public Shoe sell(){
			return new Shoe();
		}
	}
	public static void main(String[] args) {
		Shoe.ShoeFactory s=new Shoe().new ShoeFactory();
		System.out.println(s.name);
	}
}
class Customer{
	Shoe.ShoeShop a=new Shoe().new ShoeShop();
}
