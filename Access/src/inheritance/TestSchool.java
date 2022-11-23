<<<<<<< HEAD
package inheritance;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestSchool {
	
	static Logger logger=Logger.getLogger(TestSchool.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("The Program is Started.......");
		
		School s=new Student(null, null, null);
		
		s=new ClassRoom(null, null);
		
		logger.info(s.SchoolName);
		
		logger.warn("The Program is Ended.......");
		
	}
	
}

abstract class School {
	
	String SchoolName="AVM";
	
	int SchoolNetWorth=2000000;
	
}

class ClassRoom extends School{
	
	Teacher t;
	
	Student s;
	
	ClassRoom(Teacher t,Student s){
		
		this.t=t;
		
		this.s=s;
		
	}
	
}

class HM {
	
	Manager m;
	
	HM(Manager m){
		
		this.m=m;
	}
	
}

class Manager {
	
	Teacher t;
	
	ElectricalTeam e;
	 
	PipeWorkTeam p;
	
	AccountsTeam a;
	
	Driver d;
	
	Cleaner c;
	
	WatchMan w;
	
	Manager(Teacher t,ElectricalTeam e,PipeWorkTeam p,AccountsTeam a,Driver d,Cleaner c,WatchMan w){
		
		this.t=t;
		
		this.e=e;
		
		this.p=p;
		
		this.a=a;
		
		this.d=d;
		
		this.c=c;
		
		this.w=w;
		
	}
	
}

class Teacher {
	
	Student s;
	
	Teacher(Student s){
		
		this.s=s;
		
	}
	
}

class ElectricalTeam{
	
	Manager m;
	
	ElectricalTeam(Manager m){
		
		this.m=m;
		
	}
	
}

class PipeWorkTeam{
	
    Manager m;
	
    PipeWorkTeam(Manager m){
		
		this.m=m;
		
	}
	
}

class AccountsTeam{
	
    Manager m;
	
    AccountsTeam(Manager m){
		
		this.m=m;
		
	}
	
}

class Driver{
	
    Manager m;
	
    Driver(Manager m){
		
		this.m=m;
		
	}
	
}

class Cleaner{
	
    Manager m;
	
    Cleaner(Manager m){
		
		this.m=m;
		
	}
	
}

class WatchMan{
	
    Manager m;
	
    WatchMan(Manager m){
		
		this.m=m;
		
	}
	
}

class Student extends School{
	
	static Logger logger=Logger.getLogger(Student.class);
	
	Teacher t;
	
	ClassRoom c;
	
	AccountsTeam a;
	
    Student(Teacher t,ClassRoom c,AccountsTeam a){
		
		this.t=t;
		
		this.c=c;
		
		this.a=a;
		
	}
    
    void Study() {
    	
    	logger.info("Studying........");
    	
    }
	
}

class Human{}

class Man{}

class Woman{}

=======
package inheritance;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestSchool {
	
	static Logger logger=Logger.getLogger(TestSchool.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("The Program is Started.......");
		
		School s=new Student(null, null, null);
		
		s=new ClassRoom(null, null);
		
		logger.info(s.SchoolName);
		
		logger.warn("The Program is Ended.......");
		
	}
	
}

abstract class School {
	
	String SchoolName="AVM";
	
	int SchoolNetWorth=2000000;
	
}

class ClassRoom extends School{
	
	Teacher t;
	
	Student s;
	
	ClassRoom(Teacher t,Student s){
		
		this.t=t;
		
		this.s=s;
		
	}
	
}

class HM {
	
	Manager m;
	
	HM(Manager m){
		
		this.m=m;
	}
	
}

class Manager {
	
	Teacher t;
	
	ElectricalTeam e;
	 
	PipeWorkTeam p;
	
	AccountsTeam a;
	
	Driver d;
	
	Cleaner c;
	
	WatchMan w;
	
	Manager(Teacher t,ElectricalTeam e,PipeWorkTeam p,AccountsTeam a,Driver d,Cleaner c,WatchMan w){
		
		this.t=t;
		
		this.e=e;
		
		this.p=p;
		
		this.a=a;
		
		this.d=d;
		
		this.c=c;
		
		this.w=w;
		
	}
	
}

class Teacher {
	
	Student s;
	
	Teacher(Student s){
		
		this.s=s;
		
	}
	
}

class ElectricalTeam{
	
	Manager m;
	
	ElectricalTeam(Manager m){
		
		this.m=m;
		
	}
	
}

class PipeWorkTeam{
	
    Manager m;
	
    PipeWorkTeam(Manager m){
		
		this.m=m;
		
	}
	
}

class AccountsTeam{
	
    Manager m;
	
    AccountsTeam(Manager m){
		
		this.m=m;
		
	}
	
}

class Driver{
	
    Manager m;
	
    Driver(Manager m){
		
		this.m=m;
		
	}
	
}

class Cleaner{
	
    Manager m;
	
    Cleaner(Manager m){
		
		this.m=m;
		
	}
	
}

class WatchMan{
	
    Manager m;
	
    WatchMan(Manager m){
		
		this.m=m;
		
	}
	
}

class Student extends School{
	
	static Logger logger=Logger.getLogger(Student.class);
	
	Teacher t;
	
	ClassRoom c;
	
	AccountsTeam a;
	
    Student(Teacher t,ClassRoom c,AccountsTeam a){
		
		this.t=t;
		
		this.c=c;
		
		this.a=a;
		
	}
    
    void Study() {
    	
    	logger.info("Studying........");
    	
    }
	
}

class Human{}

class Man{}

class Woman{}

>>>>>>> branch 'master' of https://github.com/MayilaiMuthu/Eagle.git
class Problem{}