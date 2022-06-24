package shoe;

interface SellShoe{
	Shoe sell();
}
abstract class ShoeShop implements SellShoe{
	public Shoe sell() {
		return new Shoe();
	}
	void work() {
		System.out.println("I Know about the Customer and ShoeFactory. And,I will Sell the Shoe");
	}
}
