package Test1;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

class ConstructDemo {
	 static Logger logger=Logger.getLogger(StaticDemo.class);
	//https://fluvid.com/videos/detail/ODe_5Cv-7_Tx8Ovrw#.Yo4EA8yjrWA.link
		public static void main(String[] args) {
			String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
			PropertyConfigurator.configure(log4jConfigFile);
			//new School();
			School school;
			school=School.createSchool();
			logger.error(school);
			
			school=School.createSchool();
			logger.error(school);
			
			school=School.createSchool();
			logger.error(school);
			
			school=School.createSchool();
			logger.error(school);
			
			school=School.createSchool();
			logger.error(school);
			
			school=School.createSchool();
			logger.error(school);
			school=School.createSchool();
			logger.error(school);
			school=School.createSchool();
			logger.error(school);
			
			
			SingleTonDemo.display();
		}
	}
	class School{
		 static Logger logger=Logger.getLogger(School.class);
		private School() {
			logger.info("school object created...");
		}
		static int count=0;
		static School schoolone=new School();	
		public static School createSchool() {
			if(count<5) {			
				count++;
				return new School();
			}
			else {
				return schoolone;
			}
		}
	}
	
	//https://fluvid.com/videos/detail/ODe_5Cv-7_Tx8Ovrw#.Yo4EA8yjrWA.link
   class SingleTonDemo {
		public static void display() {
			DBConnection.getDBCon();
			DBConnection.getDBCon();
			DBConnection.getDBCon();
			DBConnection.getDBCon();
			DBConnection.getDBCon();
			DBConnection.getDBCon();
		}
	}
	class DBConnection{
		 static Logger logger=Logger.getLogger(DBConnection.class);
		private DBConnection() {
			logger.info("DBCon object created...");
		}
		private static DBConnection dbcon;
		public static DBConnection getDBCon() {
			if(dbcon==null) {
				dbcon=new DBConnection();
				return dbcon;
			}
			else {
				return dbcon;
			}
		}
	}