package newpack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamKeyWord3 {
	public static void main(String[] args) {
		//GANDHI WAY
		List glist=new ArrayList<String>();
		glist.add("a");glist.add("b");glist.add("c");glist.add("d");
		
		//RAHUL GANDHI WAY
		List<String> list=Arrays.asList("a","b","a","d","a");
		
		//RAHUL GANDHI WAY OF PROCESSING
		
		List myAlist=list.stream().filter(s->s.equals("a")).limit(2).collect(Collectors.toList());
		
		System.out.println(myAlist);
		
		//SECOND COMPLEX EXERCISE
		
		List<Student> allStudents=Arrays.asList(new Student(1,"ramu",81),new Student(1,"somu",60),new Student(1,"monu",90));
		
		//write a query to get those names who has scored more than 80 marks
		
		List students80marks=allStudents.stream().filter(s->s.marks>80).map(s->s.sname).collect(Collectors.toList());
		
		System.out.println(students80marks);
	}
}
class Student{
	public int sno;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String sname;
	public int marks;
	public Student(int sno, String sname, int marks) {
		this.sno = sno;
		this.sname = sname;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", marks=" + marks + "]";
	}
}