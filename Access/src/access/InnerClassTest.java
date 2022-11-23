<<<<<<< HEAD
package access;

public class InnerClassTest {
	public static void main(String[] args) {
		System.out.println("Process Started...........");
		IN i=new IN();
		i.dis();
		IN.ININ a=new IN().new ININ();
		a.dis();
		IN.ININ.IN3 b=new IN().new ININ().new IN3();
		b.dis();
	}
}
class IN{
	void dis() {
		System.out.println("hi");
	}
	class ININ{
		void dis() {
			System.out.println("hii");
		}
		class IN3{
			void dis() {
				System.out.println("hiii");
			}
		}
	}
=======
package access;

public class InnerClassTest {
	public static void main(String[] args) {
		System.out.println("Process Started...........");
		IN i=new IN();
		i.dis();
		IN.ININ a=new IN().new ININ();
		a.dis();
		IN.ININ.IN3 b=new IN().new ININ().new IN3();
		b.dis();
	}
}
class IN{
	void dis() {
		System.out.println("hi");
	}
	class ININ{
		void dis() {
			System.out.println("hii");
		}
		class IN3{
			void dis() {
				System.out.println("hiii");
			}
		}
	}
>>>>>>> branch 'master' of https://github.com/MayilaiMuthu/Eagle.git
}