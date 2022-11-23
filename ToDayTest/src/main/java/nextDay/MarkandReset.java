package nextDay;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

public class MarkandReset {
	
	public static void main(String[] args) throws Exception {
	
	String abc="Jack @amp; Jill went up the @amp hill";
	
	ByteArrayInputStream bi=new ByteArrayInputStream(abc.getBytes());
	
	BufferedReader bis=new BufferedReader(new InputStreamReader(bi));
	
	int a=0;
	
	boolean mark=false;
	
		while((a=bis.read())!=-1) {
			
			char c=(char)a;
			
			switch (c) {
			
			case '@': {
				
				bis.mark(32);
				
				mark=true;
				
				break;
				
			}
			
			case ';':{
				
				System.out.print("&");
				
				mark=false;
				
				break;
				
			}
			
			case ' ':{
				
				if(mark) {
					
					bis.reset();
					
					System.out.print("@");
					
					mark=false;
					
				}else {
					
					System.out.print(" ");
					
				}
				
				break;
				
			}
			
			default:{
				
				if(!mark) {
				
				System.out.print(c);
				
				}
				
			}
				
			}
			
		}
	}

}
