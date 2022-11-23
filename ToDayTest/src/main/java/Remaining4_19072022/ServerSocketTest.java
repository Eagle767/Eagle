package Remaining4_19072022;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {
	
	public static void main(String[] args) {
		
		new Server();
		
	}

}

class Server{
	
	Socket c;
	
	ServerSocket ss;
	
	public Server() {
		
		try {
			
			ss=new ServerSocket(2000);
			
			while (true) {
			
			System.out.println("Ready to accept........");
			
			c=ss.accept();
			
			System.out.println(c);
			
			PrintStream ps=new PrintStream(c.getOutputStream(),true);
			
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Please Enter Your Comments........");
			
			String msg=bf.readLine();
			
			ps.println(msg);
			
			BufferedReader bf1=new BufferedReader(new InputStreamReader(c.getInputStream()));
			
			String msg1=bf1.readLine();
			
			System.out.println("Client Told....."+msg1);
			
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public static void main(String[] args) {
		
		new Server();
		
	}
	
}

class Client{
	
	public Client() {
		
		Socket c;
			
			try {
				
				while (true) {
				
				c=new Socket("localhost", 2000);
				
				BufferedReader bf1=new BufferedReader(new InputStreamReader(c.getInputStream()));
				
				String msg1=bf1.readLine();
				
				System.out.println("Server Told....."+msg1);
				
				BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("Enter Message to Server.........");
				
				String msg=bf.readLine();
				
				PrintStream ps=new PrintStream(c.getOutputStream(),true);
				
				ps.println(msg);
				
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
			
		}
	
	public static void main(String[] args) {
		
		new Client();
		
	}
	
}