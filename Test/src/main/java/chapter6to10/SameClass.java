package chapter6to10;
//https://fluvid.com/videos/detail/aQadEULXXOt3k1YBg#.YpSJGCia9rU.link
public class SameClass{
	private int pri;
	int nomod;
	protected int pro;
	public int pub;
	public void met() {
		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}
class SamePackNonSub{
	public void met() {
		SameClass obj=new SameClass();
		//System.out.println(obj.pri);
		System.out.println(obj.nomod);
		System.out.println(obj.pro);
		System.out.println(obj.pub);
	}
}
class SamePackSub extends SameClass{
	public void met() {
		//System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}