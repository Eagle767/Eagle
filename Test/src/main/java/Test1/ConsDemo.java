package Test1;
//https://fluvid.com/videos/detail/p35djuXqDmIaY1VMZ#.YoytmOY-5Qs.link
public class ConsDemo {
	
	public ConsDemo() {
		System.out.println("cons with default called...");
	}
	public ConsDemo(int i) {
		System.out.println("cons with i value called....:"+i);
	}
	public ConsDemo(Employee e) {
		System.out.println("employee cons called...."+e);
	}
	
	
	public static void main(String[] args) {
		new ConsDemo();
		new ConsDemo(20);
		new ConsDemo(new Employee());
	}
}
class Employee{}