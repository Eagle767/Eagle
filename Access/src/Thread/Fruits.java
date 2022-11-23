package Thread;
//https://fluvid.com/videos/detail/8EL-9T-n_Gf5BZog1#.YqrFdmXMV4g.link
public enum Fruits {
	
	mango,apple("this apple is from kashmir..."),grapes;
	String details;
	private Fruits() {
		
	}
	private Fruits(String details) {
		this.details=details;
	}
}
