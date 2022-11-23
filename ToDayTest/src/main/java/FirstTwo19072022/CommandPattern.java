package FirstTwo19072022;

public class CommandPattern {
	
	public static void main(String[] args) {
		
		TV t=new TV();
		
		NetFlix f=new NetFlix();
		
		AudioSystem a=new AudioSystem();
		
		SetTopBox s=new SetTopBox();
		
		Dad dad=new Dad(t, f, a, s);
		
		Mom mom=new Mom(t, f, a, s);
		
		Son son=new Son(t, f, a, s);
		
		Remote remote=new Remote();
		
		remote.executeCommand(1);
		
		remote.setCommand(son, 0);
		
		remote.executeCommand(0);
		
		remote.setCommand(dad, 2);
		
		remote.executeCommand(2);
		
		remote.setCommand(mom, 1);
		
		remote.executeCommand(1);
		
	}

}

interface Command{
	
	public void execute();
	
}

class TV{
	
	public void swithon() {
		
		System.out.println("Tv is ON..........");
		
	}
	
	public void AV() {
		
		System.out.println("TV is AV mode..........");
		
	}
	
}

class NetFlix {
	
	public void movies() {
		
		System.out.println("movies are playing.........");
		
	}
	
}

class AudioSystem{
	
	public void sound() {
		
		System.out.println("The Sound is Ready...........");
		
	}
	
}

class SetTopBox{
	
	public void News() {
		
		System.out.println("News is Playing.......");
		
	}
	
	public void serial() {
		
		System.out.println("Serial is playing........");
		
	}
	
}

class Dummy implements Command{

	@Override
	public void execute() {

		System.out.println("It is Dummy...........");
		
	}

}

class Remote{

	Command c[]=new Command[5];
	
	public Remote() {
		
		for(int i=0;i<c.length;i++) {
			
			c[i]=new Dummy();
			
		}
		
	}
	
	public void setCommand(Command c,int a) {
		
		this.c[a]=c;
		
	}
	
	public void executeCommand(int a) {
		
		c[a].execute();
		
	}
			
}

class Mom implements Command{
	
	TV t;NetFlix f;AudioSystem a;SetTopBox s;
	
	public Mom(TV t,NetFlix f,AudioSystem a,SetTopBox s) {
		
		this.a=a;
		
		this.f=f;
		
		this.t=t;
		
		this.s=s;
		
	}

	@Override
	public void execute() {

		System.out.println("Mom go to Watch TV.............");
		
		t.swithon();
		
		t.AV();
		
		a.sound();
		
		s.serial();
		
		System.out.println("The Mom is enjoyed................");
		
	}
	
}

class Son implements Command{
	
	TV t;NetFlix f;AudioSystem a;SetTopBox s;
	
	public Son(TV t,NetFlix f,AudioSystem a,SetTopBox s) {
		
		this.a=a;
		
		this.f=f;
		
		this.t=t;
		
		this.s=s;
		
	}

	@Override
	public void execute() {

		System.out.println("Son go to Watch TV.............");
		
		t.swithon();
		
		t.AV();
		
		a.sound();
		
		f.movies();
		
		System.out.println("The Son is enjoyed................");
		
	}
	
}

class Dad implements Command{
	
	TV t;NetFlix f;AudioSystem a;SetTopBox s;
	
	public Dad(TV t,NetFlix f,AudioSystem a,SetTopBox s) {
		
		this.a=a;
		
		this.f=f;
		
		this.t=t;
		
		this.s=s;
		
	}

	@Override
	public void execute() {
		
		System.out.println("DAD go to Watch TV.............");
		
		t.swithon();
		
		t.AV();
		
		a.sound();
		
		s.News();
		
		System.out.println("The Dad is enjoyed................");
		
	}
	
}