package Test1;

public class ExpetDemo {
	//https://fluvid.com/videos/detail/n8Qdni_ar9tZn_zO4#.YpigbI8zxr0.link
		
			public static void main(String[] args) {
				System.out.println("before exception...");
				try{
					String s=args[0];
					Integer.parseInt(s);
				}catch(ArrayIndexOutOfBoundsException  ae) {
					System.out.println(ae);
				}finally {
					System.out.println("finally block code called...");
				}
				System.out.println("after exception");
			}
		}
