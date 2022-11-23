package shoe;

public class Test {

	public static void main(String[] args) {
		AbcShoeShop a=new AbcShoeShop();
		a.work();
		BataFactory b=new BataFactory();
		b.work();
		Customer c=new Customer();
		c.work();
		LeatherShoe l=new LeatherShoe();
		l.work();
		NormalShoe ns=new NormalShoe();
		ns.work();
		Shoe s=new Shoe();
		s.work();
		s.work1();
		//ShoeFactory sf=new ShoeFactory();
		//sf.work();
		//ShoeShop ss=new ShoeShop();
		//ss.work();
		VKCFoctory vf=new VKCFoctory();
	    vf.work();
	}

}
