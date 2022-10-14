package access;

public class InnerClassTesting {
	public static void main(String[] args) {
		System.out.println("The Process is Started............");
		Out1.Inn.meth();
		Hari h=new Hari();
		h.Room();
		Student m=new Hari();
		m.ID();
		m.Room();
		IdCard i=new Hari();
		i.ID();
	}
}
class Out1{
	static class Inn{
		static void meth() {}
	}
}
class Out{}

abstract class MedicalCollege implements IdCard{}

abstract class Student extends MedicalCollege{
   void Room() {}
	}
class Hari extends Student{

	@Override
	public void ID() {
		// TODO Auto-generated method stub
		
	}}
interface IdCard{
	void ID() ;
}