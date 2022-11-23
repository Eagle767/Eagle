package shoe;

interface makeShoe{
	Shoe make();
}
interface Export{
	Shoe export(); 
}
abstract class ShoeFactory implements makeShoe,Export {
	public Shoe make() {
		return new Shoe();
	}
	public Shoe export() {
		return new Shoe();
	}
	void work() {
		System.out.println("I making Shoes");
	}
}

