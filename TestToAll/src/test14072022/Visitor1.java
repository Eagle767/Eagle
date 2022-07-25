package test14072022;

public class Visitor1 {

	public static void main(String[] args) {

		Iteams[] i=new Iteams[] {new Books(45, "Java"),new Books(55, "c"),new Fruites(15, 5, "Mango")};
		
		price(i);

	}
	
	private static int price(Iteams[] i) {
		
		int sum=0;
		
		ShoppingCardVisit ss=new ShoppingCard();
		
		for(Iteams ie:i) {
			
			sum=sum+ie.items(ss);
			
		}
		
		return sum;
		
	}

}

interface ShoppingCardVisit{
	
	public int bookcost(Books b);
	
	public int fruitcost(Fruites f);
}

interface Iteams{
	
	public int items(ShoppingCardVisit sv);
	
}

class ShoppingCard implements ShoppingCardVisit{

	@Override
	public int bookcost(Books b) {
		
		int cost=0;
		
		if(b.getcost()>50) {
			
			cost=b.getcost()-5;
			
		}else {
			
			cost=b.getcost();
			
		}
		
		System.out.println("Book Name is :"+b.bookname()+" and Cost is :"+cost);
		
		return cost;
		
	}

	@Override
	public int fruitcost(Fruites f) {
		
		int cost=f.getcostperkg()*f.getweight();
		
		System.out.println("Fruit Name is :"+f.fruitname()+" and cost is :"+cost);
		
		return cost;
		
	}
	
}

class Books implements Iteams{
	
	private int a; private String b;
	
	public Books(int a,String b) {
		
		this.a=a;
		
		this.b=b;
		
	}
	
	public int getcost() {
		
		return a;
		
	}
	
	public String bookname() {
		
		return b;
		
	}

	@Override
	public int items(ShoppingCardVisit sv) {
		
		return sv.bookcost(this);
		
	}
	
}

class Fruites implements Iteams{
	
	private int a,c; private String b;
	
	public Fruites(int a,int c,String b) {
		
		this.a=a;
		
		this.b=b;
		
		this.c=c;
		
	}
	
	public int getcostperkg() {
		
		return a;
		
	}
	
	public int getweight() {
		
		return c;
		
	}
	
	public String fruitname() {
		
		return b;
		
	}

	@Override
	public int items(ShoppingCardVisit sv) {
		
		return sv.fruitcost(this);
		
	}
	
}