package accessSpecifierCheck;
import Test1.SameClass;
//https://fluvid.com/videos/detail/aQadEULXXOt3k1YBg#.YpSJGCia9rU.link
public class DifPackNonSub {
	public void met() {
		SameClass obj=new SameClass();
		//System.out.println(obj.pri);
		//System.out.println(obj.nomod);
		//System.out.println(obj.pro);
		System.out.println(obj.pub);
	}
}
class DifPackSub extends SameClass{
	public void met() {
		//System.out.println(pri);
		//System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}
